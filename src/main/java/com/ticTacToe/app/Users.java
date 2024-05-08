package com.tictactoe.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Users {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int wins;
	private int losses;
	private int draws;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
}