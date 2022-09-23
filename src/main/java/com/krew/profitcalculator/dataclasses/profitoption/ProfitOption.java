package com.krew.profitcalculator.dataclasses.profitoption;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import com.krew.profitcalculator.dataclasses.Island;
import com.krew.profitcalculator.dataclasses.Ship;

public class ProfitOption {
	// class made to store the profit option info. separeted into 3 categories
	// header, core and detailed. from the header, all info can be calculated
	// and it's this class responsibility to allocate the resulting info from
	// the header.
	
	private LevelOfDetail levelOfDetail;
	
	private ProfitOptionHeader header;
	private ProfitOptionCore core;
	private ProfitOptionDetailed detailed;
	
	public int getProfitPerSec() {
		return core.getProfitPerSec();
	}
	public int getProfit() {
		return core.getProfit();
	}
	public LevelOfDetail getLevelOfDetail() {
		return levelOfDetail;
	}
	public ProfitOptionHeader getHeader() {
		return header;
	}
	public ProfitOptionCore getCore() {
		return core;
	}
	public ProfitOptionDetailed getDetailed() {
		return detailed;
	}
	
	private void setDetailed(Island buyIsland, String cargoName, Island sellIsland, Ship ship) {
		this.detailed = new ProfitOptionDetailed();
		detailed.setMaxStorage(ship.getMaxCargoSize());
		detailed.setDistance(calculateDistance());
		detailed.setSpeed(ship.getSpeed());
		detailed.setBuyPrice(buyIsland.getIslandCargoPrices().get(cargoName).getPrice());
		detailed.setSellPrice(sellIsland.getIslandCargoPrices().get(cargoName).getPrice());
		detailed.setUnitSize(sellIsland.getIslandCargoPrices().get(cargoName).getSize());
		detailed.setUnitsBought(ship.getMaxCargoSize()/detailed.getUnitSize());
		detailed.setTotalSold(detailed.getSellPrice()*detailed.getUnitsBought());
		detailed.setTotalSpent(detailed.getBuyPrice()*detailed.getUnitsBought());
	}

	public ProfitOption(Island buyIsland, String cargoName, Island sellIsland, Ship ship, LevelOfDetail levelOfDetail) {
		this.levelOfDetail = levelOfDetail;
		this.header = new ProfitOptionHeader(buyIsland, cargoName, sellIsland, ship);
		setDetailed(buyIsland, cargoName, sellIsland, ship);
		this.core = new ProfitOptionCore(calculateProfit(), calculateTravelTime());
	}

	private int calculateProfit() {
		return detailed.getUnitsBought()*(detailed.getSellPrice() - detailed.getBuyPrice());
	}
	
	private double calculateTravelTime() {
		// i timed the trip from spain to malaysia straight line with raft 1 with 6.5 speed and i got
		// there in 4 minutes 32 seconds. if the distance between spain to malaysia is aprox 272, then the speed pixel/second
		// is d/time(s), d/272 = speed(pixel/second), to make the conversion factor, i'll need to use the rule of three
		// if 6.5 speed is d/272 (pixel/second), then 1 speed is x.
		// putting into a conversion factor, x = 1/6.5;, so, we just gotta divide the speed by 6.5 and we'll have
		// an estimate about how much time it'll take
		
		double boatSpeed = convertGameSpdToPixelPerSecond(header.getShip().getSpeed());
		return detailed.getDistance()/boatSpeed;
	}
	
	private double convertGameSpdToPixelPerSecond(double gameSpeed) {
		//dividing by 6.5 to get the speed in pixel/second by rule of three with distance in pixels (empirically measured)
		return gameSpeed/6.5;
	}
	
	private double calculateDistance() {
		Double[] startingCoordinate = header.getBuyIsland().getCoordinatesXY();
		Double[] destinationCoordinate = header.getSellIsland().getCoordinatesXY();
		// formula to distance between two points in a cartesian plane
		return sqrt(pow(destinationCoordinate[0] - startingCoordinate[0], 2) + pow(destinationCoordinate[1] - startingCoordinate[1], 2));
	}
	
	@Override
	public String toString() {
		if (levelOfDetail.toString().equals("DETAILED")) {
			
			return header.toString() + core.toString() + detailed.toString();
			
		} else if (levelOfDetail.toString().equals("HEADER")) {
			
			return header.toString() + "\n";
			
		} else {
			
			return header.toString() + core.toString() + "\n";
		}
	}
}