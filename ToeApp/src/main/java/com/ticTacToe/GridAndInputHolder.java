package com.ticTacToe;

public class GridAndInputHolder {
	// grid is 3 by 3
	private String[][] grid = {{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
	private String currentPlayer;
	private int xPosition;
	private int yPosition;
	private boolean gameWon;
	private boolean gameDrawn;
	
	GridAndInputHolder() {
		// player is x because of the convention to always begin with x
		// positions are 0 just to initiate the variable and show error if anything goes wrong
		currentPlayer = "x";
		xPosition = 0;
		yPosition = 0;
		gameWon = false;
		gameDrawn = false;
	}
	
	public boolean isGameWon() {
		return gameWon;
	}
	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}
	public boolean isGameDrawn() {
		return gameDrawn;
	}
	public void setGameDrawn(boolean gameDrawn) {
		this.gameDrawn = gameDrawn;
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
