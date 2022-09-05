package com.ticTacToe;

public class App {

	public static void main(String[] args) {
		InstanceManager manager = new InstanceManager();
		InputHandler handler = manager.getHandler();
		EndVerifier verifier = manager.getVerifier();
		TicTacToe toe = manager.getToe();
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
					handler.showMessageIfInvalidPlay();
				}
				toe.addInputToGrid();
				toe.showGrid();
				toe.switchCurrentPlayer();
			}
			if (toe.isGameDrawn()) {
				toe.declareDraw();
			} else {
				toe.declareWinner();
			}
			manager.newGame();
			keepGoing = handler.wannaKeepGoing(); 
		}
	}
}
