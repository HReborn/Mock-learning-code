package com.krew.profitcalculator.dataclasses.profitoption;

public class ProfitOptionDetailed {
	// this class is a part of the ProfitOption class
	private int maxStorage;
	private double distance;
	private double speed;
	
	private int buyPrice;
	private int sellPrice;
	private int unitSize;
	
	private int totalSpent;
	private int totalSold;
	private int unitsBought;
	
	public int getMaxStorage() {
		return maxStorage;
	}
	public double getDistance() {
		return distance;
	}
	public double getSpeed() {
		return speed;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public int getUnitSize() {
		return unitSize;
	}
	public int getTotalSpent() {
		return totalSpent;
	}
	public int getTotalSold() {
		return totalSold;
	}
	public int getUnitsBought() {
		return unitsBought;
	}
	void setMaxStorage(int maxStorage) {
		this.maxStorage = maxStorage;
	}
	void setDistance(double distance) {
		this.distance = distance;
	}
	void setSpeed(double speed) {
		this.speed = speed;
	}
	void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	void setUnitSize(int unitSize) {
		this.unitSize = unitSize;
	}
	void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}
	void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}
	void setUnitsBought(int unitsBought) {
		this.unitsBought = unitsBought;
	}
	
	@Override
	public String toString() {
		
		String totalSpent = CustomFormatter.add_k_ToBigNumbers(this.totalSpent);
		String totalSold = CustomFormatter.add_k_ToBigNumbers(this.totalSold);
		
		return  
				"\n Ship's max storage: " + maxStorage + " slots" +
				"\n       Ship's speed: " + speed + " in game speed units" +
				"\n    Travel distance: " + Math.round(distance) + "m" + //it's pixels, but let it be meters to facilitate
				"\n    Cargo buy price: $" + buyPrice + "/unit" +
				"\n   Cargo sell price: $" + sellPrice + "/unit" +
				"\n    Cargo unit size: " + unitSize + " slots/unit" +
				"\n        Total spent: $" + totalSpent + 
				"\n         Total sold: $" + totalSold + 
				"\n       Units bought: " + unitsBought + " units\n";
	}
}
