package com.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private String winner;
	private String[][] grid;
	private String currentPlayer;
	private Scanner scan;
	private int xPosition;
	private int yPosition;
	
	public TicTacToe() {
		grid = new String[3][3];
		currentPlayer = "x";
		scan = new Scanner(System.in);
	}
	
	public void addInputToGrid() {
		// grid is 3 by 3. x and y goes from 1 to 3
		// alternate between x and o while x will always begin first
		grid[this.xPosition][this.yPosition] = this.currentPlayer;
		this.switchCurrentPlayer();
	}
	private void switchCurrentPlayer() {
		if (currentPlayer.equals("x")) {
			this.currentPlayer = "o";
		} else {
			currentPlayer = "x";
		}
	}
	public void showGrid() {
		// TODO: fazer o show grid
		for (String[] line : grid) {
			for (String elmt : line) {
				System.out.print(elmt + " ");
			}
			System.out.println();
		}
	}
	public boolean verifyWinOrDraw() {
		// TODO: fazer essa lógica verifyWinOrDraw
		return true;
	}
	public void declareWinner() {
		System.out.println("Parabéns ao player " + winner +" pela vitória!");
		this.currentPlayer = "x"; // retorna o player para o estado inicial x caso player queira ir outra rodada
	}
	public boolean wannaKeepGoing() {
		System.out.println("Gostaria de ir outra partida? Digite 'yes' abaixo caso queira.");
		String answer;
		try {
			answer = this.scan.next();	
		} catch (Exception e) {
			System.out.println("Input inválido. Setando resposta para 'no'.");
			answer = "";
		}
		if (answer.equalsIgnoreCase("yes")) {
			return true;
		} else {
			this.scan.close();
			return false;
		}
	}
	public void getInput() {
		try {
			this.xPosition = this.scan.nextInt();
			this.yPosition = this.scan.nextInt();
			if (xPosition < 1 || xPosition > 3 || yPosition < 1 || yPosition > 3) {
				new Exception();
			}
		} catch (Exception e) {
			System.out.println("Input inválido. Dois números de um a três separados por espaço. Ex: '3 1'.");
			this.getInput();
		}
	}
}
