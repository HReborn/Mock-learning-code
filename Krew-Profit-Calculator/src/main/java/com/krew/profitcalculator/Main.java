package com.krew.profitcalculator;

import java.util.List;

import com.krew.profitcalculator.dataclasses.profitoption.LevelOfDetail;
import com.krew.profitcalculator.dataclasses.profitoption.ProfitOption;

public class Main {
	// program flow:
	
	// - > new calculator obj
	//     - store LevelOfDetail enum that chooses how much info to display
	//     - > new game data obj
	//         - > new data manager obj
	//             - > new data extractor obj
	//                 - extracts brute data from json/api
	//                 - store that data into JSONObjects
	//                 - provide default queries for core info
	//             - store brute info with extractor queries
	//             - provide formating methods to transform that brute data into
	//         - store formated data from the manager methods
	//             - island info into Island class
	//                 - contains cargo info that is stored into Cargo class
	//             - ship info into Ship class
	//         - provide get methods to query the formated data
	//     - query and store necessary info to search for profit options
	//     - provide methods (features) to get profit options in accord with
	//       the user needs
	//         - calculateSellRoutesFromCurrentIsland
	//         - calculateBestCargosFromCurrentToTargetIsland
	//         - calculateRoutesToAttackFromCurrentIsland
	//         - profit options are stored into a ProfitOption class
	//           when a new profit option object is created, all info
	//           for that unique header is calculated and stored
	//         - > new profit option obj
	//             - > new profit option header obj
	//                 - store info and provide a toString
	//             - > new profit option detailed obj
	//                 - store info and provide a toString
	//             - > new profit option core obj
	//                 - store info and provide a toString
	//             - calculate and put info into the header, core and detailed
	//               classes
	//             - provide a toString from header, core and detailed classes
	// 
	//
	
	public static List<ProfitOption> sellAttackDestination(String islandName) {
		Calculator calc = new Calculator(LevelOfDetail.DETAILED);
		List<ProfitOption> options = calc.calculateRoutesToAttackFromCurrentIsland(islandName, 1);
		String targetIsland = options.get(0).getHeader().getBuyIsland().getIslandName();
		String shipName = options.get(0).getHeader().getShip().getName();
		List<ProfitOption> sell = calc.calculateBestCargosFromCurrentToTargetIsland(islandName, targetIsland, shipName, 1);
		//System.out.println(options);
		return sell;
	}
	
	public static void main(String[] args) {
		// baby fancy 1: spain, brazil, cuba
		// baby fancy 2: jamaica
		//List<ProfitOption> sell = sellAttackDestination("brazil");
		Calculator calc = new Calculator(LevelOfDetail.DETAILED);
		List<ProfitOption> options = calc.calculateBestCargosFromCurrentToTargetIsland("brazil", "barbados", "baby fancy", 1);
		System.out.println(options);
	}
}
