package com.ticTacToe;
	
public class App {

	public static void main(String[] args) {
		TicTacToe toe = new TicTacToe();
		boolean keepGoing = true;
		int x = -1;
		int y = -1;
		toe.getInput();
		// this loop verifies if the player wanna play more than one game
		while (keepGoing) {
			boolean gameOver = false;
			// this loop keeps the game running until the end has come
			while (!gameOver) {
				boolean invalidInput = true;
				// this loop pauses the game until the input is valid
				while (invalidInput) {
					int[] xyPair = toe.getInput();
					x = xyPair[0];
					y = xyPair[1];
					invalidInput = !toe.validateInput(x, y);
				}
				toe.addInputToGrid(x, y);
				toe.showGrid();
				toe.switchCurrentPlayer();
				gameOver = toe.isGameOver();
			}
			toe.resetGrid();
			keepGoing = toe.wannaKeepGoing();
		}
	}

}
