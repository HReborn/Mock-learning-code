package com.ticTacToe;
	
public class App {

	public static void main(String[] args) {
		TicTacToe toe = new TicTacToe();
		toe.showGrid();
		/*
		boolean keepGoing = true;
		while (keepGoing) {
			toe.getInput();
			toe.addInputToGrid();
			toe.showGrid();
			if (toe.verifyWinOrDraw()) {
				toe.declareWinner();
			}
			keepGoing = toe.wannaKeepGoing();
		}
		*/
	}

}
