package com.ticTacToe;

import java.util.Scanner;

public class InputHandler{
	
	Scanner scan;
	GridAndInputHolder variables;
	
	public InputHandler(GridAndInputHolder variables) {
		this.scan = new Scanner(System.in);
		this.variables = variables;
	}
	
	public boolean validateInput() {
		// os dois tem que retornar falso. e o método deve retornar true pra dizer que o input é válido
		if (verifyIfInputIsOutOfGrid()) {
			System.out.println("Input inválido. Fora do tabuleiro. Tente novamente.");
			return false;
		} else if (verifyIfSpotIsTaken()) {
			System.out.println("Input inválido. Posição ocupada. Tente novamente.");
			return false;
		} else {
			return true;
		}
	}
	
	private boolean verifyIfSpotIsTaken() {
		String[][] grid = variables.getGrid();
		int x = variables.getxPosition();
		int y = variables.getyPosition();
		if (grid[x-1][y-1] == ".") {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean verifyIfInputIsOutOfGrid() {
		int x = variables.getxPosition();
		int y = variables.getyPosition();
		if (x < 1 || x > 3 || y < 1 || y > 3)
			return true;
		else {
			return false;
		}
	}
	
	public void getInput() {
		// TODO: resolver um bug que se você der input de 2 letras ex: a a, o programa continua normalmente, mas ele printa duas vezes as mensagens.
		while (true) {
			try {
				System.out.println("Digite abaixo a posição na qual o player '" + variables.getCurrentPlayer() +"' deseja jogar: ");
				int x = scan.nextInt();
				int y = scan.nextInt();
				variables.setxPosition(x);
				variables.setyPosition(y);;
				return;
			} catch (Exception e) {
				scan.next();
				System.out.println("Input inválido. Dois números de um a três separados por espaço. Ex: '3 1'. OBS: A posição precisa estar vazia.");
			}
			
		}
	}
	
	public boolean wannaKeepGoing() {
		System.out.println("Gostaria de ir outra partida? Digite 'yes' abaixo caso queira.");
		String answer;
		try {
			answer = scan.next();	
		} catch (Exception e) {
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
