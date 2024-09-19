package com.krew.profitcalculator.dataclasses.profitoption;

import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;

public class ProfitOptionHeader {
	// this class is a part of the ProfitOption class
	private Island buyIsland; 
	private String cargoName; 
	private Island sellIsland;
	private Ship ship;
	
	public Island getBuyIsland() {
		return buyIsland;
	}
	public String getCargoName() {
		return cargoName;
	}
	public Island getSellIsland() {
		return sellIsland;
	}
	public Ship getShip() {
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
		String sellIslandName = CustomFormatter.capitalize(sellIsland.getIslandName());
		String buyIslandName = CustomFormatter.capitalize(buyIsland.getIslandName());
		String cargoName = CustomFormatter.capitalize(this.cargoName);
		String shipName = CustomFormatter.capitalize(ship.getName());
		
		return  "\n" + buyIslandName + "(" + cargoName + ")" + " -> " + sellIslandName + 
				"\n" + shipName;
	}
}
