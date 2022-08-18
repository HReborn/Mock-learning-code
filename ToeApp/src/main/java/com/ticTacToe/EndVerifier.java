package com.ticTacToe;

public class EndVerifier{
	
	private GridAndInputHolder variables;
	
	public GridAndInputHolder getVariables() {
		return variables;
	}

	public void setVariables(GridAndInputHolder variables) {
		this.variables = variables;
	}

	public EndVerifier(GridAndInputHolder variables) {
		this.variables = variables;
	}
	
	public boolean isGameOver() {
		// if won or drawn set and return property as true. else return false.
		if (didSomeoneWin()) {
			variables.setGameWon(true);
			return true;
		} else if (isDraw()) {
			variables.setGameDrawn(true);
			return true;
		} else {
			return false;
		}
	}
	
	private boolean didSomeoneWin() {
		// the method will check all win conditions and return true if any is met
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
	
	private boolean isDraw() {
		// return false if there's at least one '.' in the grid as it represents
		// that there's an empty spot in the grid and the game can go on
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
