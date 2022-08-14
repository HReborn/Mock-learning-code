package com.ticTacToe;

public class TicTacToe {
	
	GridAndInputHolder variables;
	
	public TicTacToe(GridAndInputHolder variables) {
		this.variables = variables;
	}
	
	public void addInputToGrid() {
		String[][] grid = variables.getGrid();
		String currentPlayer = variables.getCurrentPlayer();
		int xPosition = variables.getxPosition();
		int yPosition = variables.getyPosition();
		// grid is 3 by 3. x and y goes from 1 to 3
		grid[xPosition-1][yPosition-1] = currentPlayer;
		variables.setGrid(grid);
	}
	
	public void resetGridAndPlayerMarker() {
		String[][] grid = variables.getGrid();
		for (int line = 0; line <= 2; line++) {
			for (int column = 0; column <= 2; column++) {
				grid[line][column] = ".";
			}
		}
		variables.setGrid(grid);
		variables.setCurrentPlayer("x");
	}
	
	public void switchCurrentPlayer() {
		if (variables.getCurrentPlayer().equals("x")) {
			variables.setCurrentPlayer("o");
		} else {
			variables.setCurrentPlayer("x");
		}
	}
	
	public void showGrid() {
		for (String[] line : variables.getGrid()) {
			for (String elmt : line) {
				System.out.print(elmt + " ");
			}
			System.out.println();
		}
	}
}
