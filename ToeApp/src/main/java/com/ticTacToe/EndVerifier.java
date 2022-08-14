package com.ticTacToe;

public class EndVerifier{
	
	GridAndInputHolder variables;
	
	public EndVerifier(GridAndInputHolder variables) {
		this.variables = variables;
	}
	
	public boolean isGameOver(TicTacToe toe) {
		if (verifyWin()) {
			toe.switchCurrentPlayer(); //troca o player pra voltar ao último player que jogou
			System.out.println("Parabéns ao player " + variables.getCurrentPlayer() +" pela vitória!");
			return true;
		} else if (verifyDraw()) {
			System.out.println("It's a draw!");
			return true;
		} else {
			return false;
		}
	}
	
	private boolean verifyWin() {
		// TODO: fazer um algorítimo para isso. Por enquanto, deixar hardcoded.
		String[][] grid = variables.getGrid();
		boolean upperLineMatch = ((grid[0][0] + grid[0][1] + grid[0][2]).equals("xxx")) || ((grid[0][0] + grid[0][1] + grid[0][2]).equals("ooo"));
		boolean middleLineMatch = ((grid[1][0] + grid[1][1] + grid[1][2]).equals("xxx")) || ((grid[1][0] + grid[1][1] + grid[1][2]).equals("ooo"));
		boolean bottomLineMatch = ((grid[2][0] + grid[2][1] + grid[2][2]).equals("xxx")) || ((grid[2][0] + grid[2][1] + grid[2][2]).equals("ooo"));
		boolean rightDiagonalMatch = ((grid[0][0] + grid[1][1] + grid[2][2]).equals("xxx")) || ((grid[0][0] + grid[1][1] + grid[2][2]).equals("ooo"));
		boolean leftDiagonalMatch = ((grid[0][2] + grid[1][1] + grid[2][0]).equals("xxx")) || ((grid[0][2] + grid[1][1] + grid[2][0]).equals("ooo"));
		boolean leftColumnMatch = ((grid[0][0] + grid[1][0] + grid[2][0]).equals("xxx")) || ((grid[0][0] + grid[1][0] + grid[2][0]).equals("ooo"));
		boolean middleColumMatch = ((grid[0][1] + grid[1][1] + grid[2][1]).equals("xxx")) || ((grid[0][1] + grid[1][1] + grid[2][1]).equals("ooo"));
		boolean rightColumnMatch = ((grid[0][2] + grid[1][2] + grid[2][2]).equals("xxx")) || ((grid[0][2] + grid[1][2] + grid[2][2]).equals("ooo"));
		if (upperLineMatch || middleLineMatch || bottomLineMatch || rightDiagonalMatch || leftDiagonalMatch || leftColumnMatch || middleColumMatch || rightColumnMatch) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean verifyDraw() {
		String[][] grid = variables.getGrid();
		for (String[] line : grid) {
			for (String elmt : line) {
				if (elmt.equals(".")) {
					return false;
				}
			}
		}
		return true;
	}
	
	
}
