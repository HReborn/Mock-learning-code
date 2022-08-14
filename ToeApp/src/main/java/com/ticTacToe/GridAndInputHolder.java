package com.ticTacToe;

public class GridAndInputHolder {
	private String[][] grid = {{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
	private String currentPlayer;
	private int xPosition;
	private int yPosition;
	
	GridAndInputHolder() {
		currentPlayer = "x";
		xPosition = 0;
		yPosition = 0;
	}
	
	public String[][] getGrid() {
		return grid;
	}
	public void setGrid(String[][] grid) {
		this.grid = grid;
	}
	public String getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
}
