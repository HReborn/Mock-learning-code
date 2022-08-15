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
			// this loop keeps the game running until the end has come
			while (!verifier.isGameOver()) {
				// this loop pauses the game until the input is valid
				while (!handler.isThePlayValid()) {
					// it'll verify the previous input first but as the grid
					// position is already taken, the method will return false
					handler.getInput();
				}
				toe.addInputToGrid();
				toe.showGrid();
				toe.switchCurrentPlayer();
			}
			if (variables.isGameDrawn()) {
				toe.declareDraw();
			} else {
				toe.declareWinner();
			}
			toe.setUpDefaultFieldAndProperties();
			keepGoing = handler.wannaKeepGoing(); 
		}
	}
}
