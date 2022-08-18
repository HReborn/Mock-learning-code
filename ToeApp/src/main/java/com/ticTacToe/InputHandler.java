package com.ticTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler{
	
	private Scanner scan;
	private GridAndInputHolder variables;
	
	public GridAndInputHolder getVariables() {
		return variables;
	}

	public void setVariables(GridAndInputHolder variables) {
		this.variables = variables;
	}

	public InputHandler(GridAndInputHolder variables) {
		this.scan = new Scanner(System.in); // scanner will be closed in the wannaKeepGoing method
		this.variables = variables;
	}
	
	public boolean isThePlayValid() {
		// this method will be called after getInput checks if there isn't any typeMismatchException.
		// the inputs are saved after getInput and the two methods below will handle getting and checking
		// those inputs from the 'variables' object.
		if (isInputIsOutOfGrid()) {
			return false;
		} else if (isSpotTaken()) {
			return false;
		} else {
			return true;
		}
	}
	
	public void showMessageIfInvalidPlay() {
		// can't use 'else' to prevent that the message is shown at the wrong time
		if (isSpotTaken()) {
			System.out.println("Input inválido. Posição ocupada. Tente novamente.");
		} else if (isInputIsOutOfGrid()) {
			System.out.println("Input inválido. Fora do tabuleiro. Tente novamente.");
		}
	}
	
	private boolean isSpotTaken() {
		String[][] grid = variables.getGrid();
		int x = variables.getxPosition();
		int y = variables.getyPosition();
		if (grid[x-1][y-1] == ".") {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean isInputIsOutOfGrid() {
		int x = variables.getxPosition();
		int y = variables.getyPosition();
		if (x < 1 || x > 3 || y < 1 || y > 3)
			return true;
		else {
			return false;
		}
	}
	
	public void getInput() {
		// this method will use the Scanner to get and save user input 
		// and will ensure that the input is an int with the try-catch with while
		// TODO: resolver um bug que se você der input de 2 letras ex: a a, o programa continua normalmente, mas ele printa duas vezes as mensagens.
		while (true) {
			try {
				System.out.println("Digite abaixo a posição na qual o player '" + variables.getCurrentPlayer() +"' deseja jogar: ");
				System.out.println("Ex: Dois números de um a três separados por espaço: '3 1'.");
				int x = scan.nextInt();
				int y = scan.nextInt();
				// the next two lines only saves the input and does not place the marker
				variables.setxPosition(x);
				variables.setyPosition(y);;
				return;
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("Input inválido. Digite dois números de um a três separados por espaço. Ex: '3 1'.");
			}
		}
	}
	
	public boolean wannaKeepGoing() {
		// this method will be called after each game has ended to check if the player
		// wants to go for another round and it'll only return true if user types 'yes'
		// else it'll return false and close the scanner
		System.out.println("Gostaria de ir outra partida? Digite 'yes' abaixo caso queira.");
		String answer;
		try {
			answer = scan.next();	
		} catch (InputMismatchException e) {
			System.out.println("Vejo que não quer continuar. Até mais :D .");
			scan.close();
			return false;
		}
		if (answer.equalsIgnoreCase("yes")) {
			return true;
		} else {
			System.out.println("Vejo que não quer continuar. Até mais :D .");
			scan.close();
			return false;
		}
	}
}
