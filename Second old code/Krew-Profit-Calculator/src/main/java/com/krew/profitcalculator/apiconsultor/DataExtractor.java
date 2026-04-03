package com.krew.profitcalculator.apiconsultor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


class DataExtractor {
	// objective of this class is to extract all relevant info from the game's api
	// and ship that info to the DataManager class and then manipulate that data
	// to achieve an objective.
	// obs: this class shouldn't do any data transformation. the only responsability
	// of this class should be to send brute format data to the DataManager class
	// and only then to transform the data.
	
	private final String DATA = "src/main/resources/data.json";
	private final String SHIPS = "src/main/resources/ships.json";
	private JSONObject dataJsonObj = null;
	private JSONObject shipsJsonObj = null;
	private String errorFile = "";
	private Exception e = null;
	
	DataExtractor() {
		try {
			dataJsonObj = getJsonObject(DATA).orElseThrow();
			errorFile = DATA;
			shipsJsonObj = getJsonObject(SHIPS).orElseThrow();
			errorFile = SHIPS;		
		} catch (NoSuchElementException e) {
			// the expected scenario is to always have the files correcly delivering
			// the jsonobject. if there's an error with the file, it needs to be
			// manually fixed.
			throw new RuntimeException("Game info could not be loaded from " + errorFile + ".", this.e);
		}
	}
	
	@SuppressWarnings("unchecked")
	Map<String, String> getAllIslandsCoordinates() {
		// while on the json i took a print and used pixel coordinates to locate island position.
		// x and y coordinates goes from 0 to 356 pixels
		// (0,0) starts bottom left and follows normal x, y plane rules.
		// Map<islandName, "x y">
		return (Map<String, String>) dataJsonObj.get("islandsXYCoordinates");
	}
	@SuppressWarnings("unchecked")
	Map<String, String> getAllCargoSizes() {
		// Map<cargoName, cargoSizeInt>
		return (Map<String, String>) dataJsonObj.get("cargoSize");
	}
	@SuppressWarnings("unchecked")
	Map<String, Map<String, String>> getPriceTable() {
		// Map<islandName, Map<cargoName, cargoPriceInt>>
		return (Map<String, Map<String, String>>) dataJsonObj.get("islandCargoPriceTable");
	}
	@SuppressWarnings("unchecked")
	Map<String, Map<String, String>> getShipPropertiesInfoTable() {
		// Map<shipName, Map<propertyName, propertyValueObject>>
		return (Map<String, Map<String, String>>) shipsJsonObj;
	}
	
	private Optional<JSONObject> getJsonObject(String filePath) {
		FileReader reader;
		JSONObject jsonObj = null;
		try {
			reader = new FileReader(filePath);
			JSONParser parser = new JSONParser();
			jsonObj = (JSONObject) parser.parse(reader);
		} catch (FileNotFoundException e) {
			this.e = e;
		} catch (IOException e) {
			this.e = e;
		} catch (ParseException e) {
			this.e = e;
		} 
		return Optional.ofNullable(jsonObj);
	}
}