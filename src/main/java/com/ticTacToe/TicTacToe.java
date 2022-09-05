package com.ticTacToe;

public class TicTacToe {
	
	private GridAndInputHolder variables;

	public GridAndInputHolder getVariables() {
		return variables;
	}

	public void setVariables(GridAndInputHolder variables) {
		this.variables = variables;
	}

	public TicTacToe(GridAndInputHolder variables) {
		this.variables = variables;
	}
	
	public void addInputToGrid() {
		String[][] grid = variables.getGrid();
		grid[variables.getxPosition()-1][variables.getyPosition()-1] = variables.getCurrentPlayer();
		variables.setGrid(grid);
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
	
	public boolean isGameDrawn() {
		return variables.isGameDrawn();
	}
	
	public boolean isGameWon() {
		return variables.isGameWon();
	}
}
