package com.krew.profitcalculator.dataclasses.profitoption;

class ProfitOptionCore {
	// this class is a part of the ProfitOption class
	private int profit;
	private double timeSpent;
	private int profitPerSec;
	
	double getTimeSpent() {
		return timeSpent;
	}
	int getProfit() {
		return profit;
	}
	int getProfitPerSec() {
		return profitPerSec;
	}
	void setTimeSpent(double timeSpent) {
		this.timeSpent = timeSpent;
	}
	void setProfit(int profit) {
		this.profit = profit;
	}
	ProfitOptionCore(int profit, double timeSpent) {
		this.timeSpent = timeSpent;
		this.profit = profit;
		this.profitPerSec = (int) Math.round(Double.valueOf(profit)/timeSpent);
	}
	
	@Override
	public String toString() {
		
		String profit = String.valueOf(this.profit);
		// format profit to 15k or keep value if less than 1000
		if (this.profit > 1000) {
			profit = String.valueOf(this.profit/1000) + "k";
		} 
		
		// format time from double seconds to string minutes and seconds
		String timeSpent = String.valueOf(((int) this.timeSpent/60) + "m" + Math.round(this.timeSpent%60) + "s");
		
		return 
				"\n  Profit To Be Made: " + "$" + profit +
				"\n        Travel Time: " + timeSpent + 
				"\n  Profit per Second: " + "$" + profitPerSec + "/s";
	}
}
