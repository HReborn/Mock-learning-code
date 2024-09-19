package com.krew.profitcalculator.apiconsultor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.krew.profitcalculator.dataclasses.Cargo;
import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;

class DataManager {
	// the objective of this class is to receive the brute data from the
	// DataExtractor class and do any data transformation necessary to
	// store the transformed data into the GameData class
	
	private DataExtractor extractor;
	private Map<String, String> islandCoordinates;
	private Map<String, String> cargoSizes;
	private Map<String, Map<String, String>> priceTable;
	private Map<String, Map<String, String>> shipPropertiesInfoTable;
	
	DataManager() {
		this.extractor = new DataExtractor();
		islandCoordinates = extractor.getAllIslandsCoordinates();
		cargoSizes = extractor.getAllCargoSizes();
		priceTable = extractor.getPriceTable();
		shipPropertiesInfoTable = extractor.getShipPropertiesInfoTable();
	}
	
	Map<String, Island> buildIslandCargoPriceDataTable() {
		
		Set<String> cargoNames = cargoSizes.keySet();
		Set<String> islandNames = islandCoordinates.keySet();
		
		Map<String, Island> islandCargoPriceDataTable = new HashMap<>();
		for (String islandName : islandNames) {
			Map<String, Cargo> cargoInfos = new HashMap<>();
			for (String cargoName : cargoNames) {
				Integer cargoPrice = Integer.valueOf(priceTable.get(islandName).get(cargoName));
				Integer cargoSize = Integer.valueOf(cargoSizes.get(cargoName));
				Cargo cargoInfo = new Cargo(cargoPrice, cargoSize);
				cargoInfos.put(cargoName, cargoInfo);
			}
			String[] coordinatesxy = islandCoordinates.get(islandName).split(" ");
			Double[] coordinatesXY = new Double[2];  
			coordinatesXY[0] = Double.valueOf(coordinatesxy[0]);
			coordinatesXY[1] = Double.valueOf(coordinatesxy[1]);
			Island islandInfo = new Island(coordinatesXY, cargoInfos, islandName);
			islandCargoPriceDataTable.put(islandName, islandInfo);
		}
		return islandCargoPriceDataTable;
	}
	
	Map<String, Ship> buildShipPropertiesInfo() {
		
		Set<String> shipNames = shipPropertiesInfoTable.keySet();
		Map<String, Ship> shipPropertiesInfo = new HashMap<>();
		for (String shipName : shipNames) {
			Map<String, String> properties = shipPropertiesInfoTable.get(shipName);
			String[] availableat = properties.get("islands").split(" ");
			List<String> availableAt = Arrays.asList(availableat);

			Ship shipProperties = new Ship(
					shipName, 
					properties.get("type"), 
					Integer.valueOf(properties.get("price")), 
					availableAt, 
					Integer.valueOf(properties.get("hp")), 
					Double.valueOf(properties.get("turnSpeed")), 
					Double.valueOf(properties.get("speed")), 
					Integer.valueOf(properties.get("crewLimit")), 
					Integer.valueOf(properties.get("storageSize")), 
					Integer.valueOf(properties.get("regeneration")));
			shipPropertiesInfo.put(shipName, shipProperties);
		}
		return shipPropertiesInfo;
	}
}
