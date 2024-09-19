package com.krew.profitcalculator.apiconsultor;

import java.util.Map;

import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;

public class GameData {
	// the objective of this class is to store the necessary data that
	// the program needs to make queries, comparations, simulations and 
	// calculations.
	
	private Map<String, Island> islandCargoPriceDataTable;
	private Map<String, Ship> shipPropertiesInfo;
	private DataManager manager;
	
	protected GameData() {
		this.manager = new DataManager();
		this.islandCargoPriceDataTable = manager.buildIslandCargoPriceDataTable();
		this.shipPropertiesInfo = manager.buildShipPropertiesInfo();
	}

	protected Map<String, Island> getIslandCargoPriceDataTable() {
		return islandCargoPriceDataTable;
	}
	protected Map<String, Ship> getShipPropertiesInfo() {
		return shipPropertiesInfo;
	}
}
