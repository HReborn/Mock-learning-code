package com.ticTacToe;
	
public class App {

	public static void main(String[] args) {
		GridAndInputHolder variables = new GridAndInputHolder();
		TicTacToe toe = new TicTacToe(variables);
		InputHandler handler = new InputHandler(variables);
		EndVerifier verifier = new EndVerifier(variables);
		boolean keepGoing = true;
		// this loop verifies if the player wanna play more than one game
		while (keepGoing) {
			boolean gameOver = false;
			// this loop keeps the game running until the end has come
			while (!gameOver) {
				boolean invalidInput = true;
				// this loop pauses the game until the input is valid
				while (invalidInput) {
					handler.getInput();
					invalidInput = !handler.validateInput();
				}
				toe.addInputToGrid();
				toe.showGrid();
				toe.switchCurrentPlayer();
				gameOver = verifier.isGameOver(toe);
			}
			toe.resetGridAndPlayerMarker();
			keepGoing = handler.wannaKeepGoing(); 
		}
	}

}
