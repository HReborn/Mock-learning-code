package com.bitsofcode.iteratordesignpattern.avoidduplication;

public class DataClass {
	
	private String infoString;
	private Integer infoInteger;
	private Character infoCharacter;
	private Boolean infoBoolean;
	
	public DataClass(String infoString, Integer infoInteger, Character infoCharacter, Boolean infoBoolean) {
		this.infoBoolean = infoBoolean;
		this.infoCharacter = infoCharacter;
		this.infoInteger = infoInteger;
		this.infoString = infoString;
	}

	public String getInfoString() {
		return infoString;
	}
	public Integer getInfoInteger() {
		return infoInteger;
	}
	public Character getInfoCharacter() {
		return infoCharacter;
	}
	public Boolean getInfoBoolean() {
		return infoBoolean;
	}
	
	@Override
	public String toString() {
		return "Name: " + infoString + 
				"\nChoice: " + infoCharacter + 
				"\nID: " + infoInteger + 
				"\nStrong: " + infoBoolean;
	}
}
