package com.krew.profitcalculator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.krew.profitcalculator.apiconsultor.GameData;
import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;
import com.krew.profitcalculator.dataclasses.profitoption.LevelOfDetail;
import com.krew.profitcalculator.dataclasses.profitoption.ProfitOption;

public class Calculator extends GameData {
	// objective of this class is to query the program/database and get a list of profit options
	
	// TODO: a feature that finds the N most profitable routes from each existing islands 
	
	private Map<String, Ship> shipPropertiesInfo;
	private Map<String, Island> islandCargoPriceDataTable;
	private LevelOfDetail levelOfDetail;
	
	public void setLevelOfDetail(LevelOfDetail levelOfDetail) {
		this.levelOfDetail = levelOfDetail;
	}
	
	public Calculator() {
		this.shipPropertiesInfo = super.getShipPropertiesInfo();
		this.islandCargoPriceDataTable = super.getIslandCargoPriceDataTable();
		this.levelOfDetail = LevelOfDetail.CORE;
	}
	
	public Calculator(LevelOfDetail levelOfDetail) {
		this();
		this.levelOfDetail = levelOfDetail;
	}
	
	public List<ProfitOption> calculateSellRoutesFromCurrentIsland(String buyIslandName, String shipName, int... displayNumberVarargs) {
		// uses varargs to set up optional parameter and i use another variable to discard the array
		
		int displayNchoices = setWithFirstInputValueOrDefaultValueIfNull(displayNumberVarargs);
		
		Set<String> islandNameList = islandCargoPriceDataTable.keySet();
		List<ProfitOption> profitOptions = new ArrayList<>();
		for(String sellIslandName : islandNameList) {
			profitOptions.addAll(calculateBestCargosFromCurrentToTargetIsland(buyIslandName, sellIslandName, shipName, 100));
		}
		return sortAndLimit(profitOptions, displayNchoices);
	}
	
	public List<ProfitOption> calculateRoutesToAttackFromCurrentIsland(String currentIslandAsSellIslandName, int... displayNumberVarargs) {
			
		// this method answer the question "if i wanna pvp and i'm in island A, from which
		// islands ppl will be coming so that i take the route to intercept them?
		// this method will calculate from the most profitable route from all islands to
		// island A and the most profitable route from all the islands will be the 
		// best route to attack because that route will have a higher chance of encountering
		// lucrative traders.
		
		// obs: this option only affects how many possible attack routes the method will show from each
		// island to the current island there can be only one profit option bc the objective is just to
		// find the top profit option from all islands to the current island and rank those options
		// so that the most profitable options will be the most probable routes traders are gonna take
		// so those are the routes i'm gonna intercept
		int displayNchoices = setWithFirstInputValueOrDefaultValueIfNull(displayNumberVarargs);
		
		String defaultShipName = "trader 1"; // most common profit target. this is the goal.
		Set<String> islandNameList = islandCargoPriceDataTable.keySet();
		List<ProfitOption> routesToAttack = new ArrayList<>();
		for (String targetIslandAsBuyIslandName : islandNameList) {
			routesToAttack.addAll(calculateBestCargosFromCurrentToTargetIsland(targetIslandAsBuyIslandName, currentIslandAsSellIslandName, defaultShipName, 1));
		}
		
		return sortAndLimit(routesToAttack, displayNchoices);
	}
	
	public List<ProfitOption> calculateBestCargosFromCurrentToTargetIsland(String buyIslandName, String sellIslandName, String shipName, int... displayNumberVarargs) {
		// this method answers the question "is there any way to profit from A to B?"
		
		// uses varargs to set up optional parameter and i use another variable to discard the array
		int displayNchoices = setWithFirstInputValueOrDefaultValueIfNull(displayNumberVarargs);
		
		Island buyIsland = islandCargoPriceDataTable.get(buyIslandName);
		Ship ship = shipPropertiesInfo.get(shipName);
		Set<String> cargoList = buyIsland.getIslandCargoPrices().keySet();
		Island sellIsland = islandCargoPriceDataTable.get(sellIslandName);
		
		List<ProfitOption> profitOptions = cargoList.stream()
				.filter(cargoName -> sellIsland.getCargo(cargoName).getPrice() > buyIsland.getCargo(cargoName).getPrice())
				.map(cargoName -> new ProfitOption(buyIsland, cargoName, sellIsland, ship, levelOfDetail))
				.collect(Collectors.toList());
		
		return sortAndLimit(profitOptions, displayNchoices);
	}
	
	private List<ProfitOption> sortAndLimit(List<ProfitOption> profitOptions, int displayNchoices) {
		profitOptions = profitOptions.stream()
				.sorted(Comparator
						.comparing(ProfitOption::getProfitPerSec).reversed()
						.thenComparing(Comparator.comparing(ProfitOption::getProfit).reversed()))
				.limit(displayNchoices)
				.collect(Collectors.toList());
		return profitOptions;
	}
	
	private int setWithFirstInputValueOrDefaultValueIfNull(int[] displayNumberVarargs) {
		if (displayNumberVarargs.length > 0) {
			return displayNumberVarargs[0];
		} else {
			return 2; // default value
		}
	}
}