package com.ticTacToe;

public class InstanceManager {
	private TicTacToe toe;
	private InputHandler handler;
	private EndVerifier verifier;
	private GridAndInputHolder variables;
	
	public TicTacToe getToe() {
		return toe;
	}
	public InputHandler getHandler() {
		return handler;
	}
	public EndVerifier getVerifier() {
		return verifier;
	}
	public GridAndInputHolder getVariables() {
		return variables;
	}

	InstanceManager() {
		variables = new GridAndInputHolder();
		toe = new TicTacToe(variables);
		handler = new InputHandler(variables);
		verifier = new EndVerifier(variables);
	}
	
	public void newGame() {
		this.variables = new GridAndInputHolder();
		toe.setVariables(variables);
		verifier.setVariables(variables);
		handler.setVariables(variables);
	}
}
