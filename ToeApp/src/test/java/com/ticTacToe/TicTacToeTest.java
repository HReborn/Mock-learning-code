package com.ticTacToe;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
	
	private GridAndInputHolder variables;
	private TicTacToe toe;
	
	@BeforeEach
	void setUp() {
		variables = new GridAndInputHolder();
		toe = new TicTacToe(variables);
	}
	
	@Test
	void CheckIfInputIsPlacedCorrectlyOnGrid() {
		// the test will check if all nine positions can individually hold the marker
	}
	
	@Test
	void CheckIfTheWholeGridIsAddedCorrectlyToDraw() {
		// the test will check if there's a problem to fill the grid till it's a draw
	}
	
	@Test
	void CheckIfFieldIsReset() {
		// the test will check if the grid, marker and positions are set to a default initial state
		String[][] mockGrid = {{"x", "o", "x"}, {"x", "o", "x"}, {"o", "x", "o"}};
		variables.setCurrentPlayer("o");
		variables.setGameDrawn(true);
		variables.setGameWon(true);
		variables.setGrid(mockGrid);
		variables.setxPosition(3);
		variables.setyPosition(3);
		String[][] grid = {{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
		toe.setUpDefaultFieldAndProperties();
		assertTrue(Arrays.deepEquals(grid, variables.getGrid()));
		assertEquals("x", variables.getCurrentPlayer());
		assertEquals(-1, variables.getxPosition());
		assertEquals(-1, variables.getyPosition());
		assertEquals(false, variables.isGameDrawn());
		assertEquals(false, variables.isGameWon());
	}
	
	@Test
	void CheckIfPlayerReallySwitches() {
		// will check if the variables.currentplayer attribute will change to the other marker
	}
	
	@Test
	void CheckIfGridIsShownCorrectly() {
		/*
		String grid1 = ". . . \n" + 
				       ". . . \n" + 
				       ". . . \n";
		String grid2 = "x x x \n" + 
			           "o x o \n" + 
			           "x o x \n";
			           */
	}
	
	@Test
	void CheckIfTheWinnerIsDeclared() {
		
	}
	
	@Test
	void CheckIfTheDrawIsDeclared() {
		
	}
}
