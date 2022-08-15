package com.ticTacToe;

public class TicTacToe {
	
	GridAndInputHolder variables;
	
	public TicTacToe(GridAndInputHolder variables) {
		this.variables = variables;
	}
	
	public void addInputToGrid() {
		String[][] grid = variables.getGrid();
		grid[variables.getxPosition()-1][variables.getyPosition()-1] = variables.getCurrentPlayer();
		variables.setGrid(grid);
	}
	
	public void setUpDefaultFieldAndProperties() {
		// sets all attributes to default value
		String[][] grid = variables.getGrid();
		for (int line = 0; line <= 2; line++) {
			for (int column = 0; column <= 2; column++) {
				grid[line][column] = ".";
			}
		}
		// values below are in accord to the class GridAndInputHolder
		variables.setGrid(grid);
		variables.setCurrentPlayer("x");
		variables.setyPosition(-1);
		variables.setxPosition(-1);
		variables.setGameWon(false);
		variables.setGameDrawn(false);
	}
	
	public void switchCurrentPlayer() {
		// after every marker placed in the field, this method has the
		// function to change the current player so that the next player can 
		// have it's chance to play and the marker is appropriate for each player
		if (variables.getCurrentPlayer().equals("x")) {
			variables.setCurrentPlayer("o");
		} else {
			variables.setCurrentPlayer("x");
		}
	}
	
	public void showGrid() {
		String grid = "";
		for (String[] line : variables.getGrid()) {
			for (String elmt : line) {
				grid += elmt + " ";
			}
			grid += "\n";
		}
		System.out.println(grid);
	}
	
	public void declareWinner() {
		// quando o player joga, a propriedade currentplayer muda pro próximo player
		// e para dar um display correto do vencedor, a linha abaixo troca de volta
		switchCurrentPlayer(); 
		System.out.println("Parabéns ao player " + variables.getCurrentPlayer() +" pela vitória!");
	}
	
	public void declareDraw() {
		System.out.println("It's a draw!");
	}
}
