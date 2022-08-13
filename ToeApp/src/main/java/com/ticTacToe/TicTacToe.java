package com.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private String[][] grid = {{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
	private String currentPlayer;
	private Scanner scan;
	
	public TicTacToe() {
		currentPlayer = "x";
		scan = new Scanner(System.in);
	}
	
	public void addInputToGrid(int x, int y) {
		// grid is 3 by 3. x and y goes from 1 to 3
		// alternate between x and o while x will always begin first
		this.grid[x-1][y-1] = this.currentPlayer;
	}
	
	public boolean isGameOver() {
		if (verifyWin()) {
			switchCurrentPlayer(); //troca o player pra voltar ao último player que jogou
			System.out.println("Parabéns ao player " + currentPlayer +" pela vitória!");
			return true;
		} else if (verifyDraw()) {
			System.out.println("It's a draw!");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateInput(int x, int y) {
		// os dois tem que retornar falso. e o método deve retornar true pra dizer que o input é válido
		if (verifyIfInputIsOutOfGrid(x, y)) {
			System.out.println("Input inválido. Fora do tabuleiro. Tente novamente.");
			return false;
		} else if (verifyIfSpotIsTaken(x, y)) {
			System.out.println("Input inválido. Posição ocupada. Tente novamente.");
			return false;
		} else {
			return true;
		}
	}
	
	public void resetGrid() {
		for (int line = 0; line <= 2; line++) {
			for (int column = 0; column <= 2; column++) {
				this.grid[line][column] = ".";
			}
		}
	}
	
	public void switchCurrentPlayer() {
		if (currentPlayer.equals("x")) {
			this.currentPlayer = "o";
		} else {
			currentPlayer = "x";
		}
	}
	
	public void showGrid() {
		for (String[] line : this.grid) {
			for (String elmt : line) {
				System.out.print(elmt + " ");
			}
			System.out.println();
		}
	}
	
	private boolean verifyWin() {
		// TODO: fazer um algorítimo para isso. Por enquanto, deixar hardcoded.
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
		for (String[] line : this.grid) {
			for (String elmt : line) {
				if (elmt.equals(".")) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public boolean wannaKeepGoing() {
		System.out.println("Gostaria de ir outra partida? Digite 'yes' abaixo caso queira.");
		String answer;
		try {
			answer = this.scan.next();	
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
	public int[] getInput() {
		// TODO: resolver um bug que se você der input de 2 letras ex: a a, o programa continua normalmente, mas ele printa duas vezes as mensagens.
		int[] xyPair = {-1,-1}; // x e y
		while (true) {
			try {
				System.out.println("Digite abaixo a posição na qual o player '" + currentPlayer +"' deseja jogar: ");
				xyPair[0] = this.scan.nextInt();
				xyPair[1] = this.scan.nextInt();
				return xyPair;
			} catch (Exception e) {
				scan.next();
				System.out.println("Input inválido. Dois números de um a três separados por espaço. Ex: '3 1'. OBS: A posição precisa estar vazia.");
			}
			
		}
	}
	
	private boolean verifyIfSpotIsTaken(int x, int y) {
		if (this.grid[x-1][y-1] == ".") {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean verifyIfInputIsOutOfGrid(int x, int y) {
		if (x < 1 || x > 3 || y < 1 || y > 3)
			return true;
		else {
			return false;
		}
	}
}
