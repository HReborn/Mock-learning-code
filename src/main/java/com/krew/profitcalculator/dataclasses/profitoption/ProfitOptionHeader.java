package com.krew.profitcalculator.dataclasses.profitoption;

import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;

class ProfitOptionHeader {
	// this class is a part of the ProfitOption class
	private Island buyIsland; 
	private String cargoName; 
	private Island sellIsland;
	private Ship ship;
	
	Island getBuyIsland() {
		return buyIsland;
	}
	String getCargoName() {
		return cargoName;
	}
	Island getSellIsland() {
		return sellIsland;
	}
	Ship getShip() {
		return ship;
	}
	void setBuyIsland(Island buyIsland) {
		this.buyIsland = buyIsland;
	}
	void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	void setSellIsland(Island sellIsland) {
		this.sellIsland = sellIsland;
	}
	void setShip(Ship ship) {
		this.ship = ship;
	}
	ProfitOptionHeader(Island buyIsland, String cargoName, Island sellIsland, Ship ship) {
		super();
		this.buyIsland = buyIsland;
		this.cargoName = cargoName;
		this.sellIsland = sellIsland;
		this.ship = ship;
	}
	
	@Override
	public String toString() {
		// capitalize ship, island and cargo name
		String sellIslandName = sellIsland.getIslandName().substring(0, 1).toUpperCase() + sellIsland.getIslandName().substring(1);
		String buyIslandName = buyIsland.getIslandName().substring(0, 1).toUpperCase() + buyIsland.getIslandName().substring(1);
		String cargoName = this.cargoName.substring(0, 1).toUpperCase() + this.cargoName.substring(1);
		String shipName = ship.getName().substring(0, 1).toUpperCase() + ship.getName().substring(1);
		
		return  "\n" + buyIslandName + "(" + cargoName + ")" + " -> " + sellIslandName + 
				"\n" + shipName;
	}
}
