package com.krew.profitcalculator.apiconsultor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataExtractorTest {
	// comments below should be equal to the DataExtractor class comments
	
	@Test
	void coordinatesShouldBeReturnedIntoTheCorrectFormat() {
		// Map<String, String>
		// Map<islandName, "x y">
		assertTrue(true);
	}
	@Test
	void cargoSizesShouldBeReturnedIntoTheCorrectFormat() {
		// Map<String, String>
		// Map<cargoName, cargoSizeInt>
	}
	@Test
	void PriceTableShouldBeReturnedIntoTheCorrectFormat() {
		// Map<String, Map<String, String>>
		// Map<islandName, Map<cargoName, cargoPriceInt>>
	}
	@Test
	void shipsShouldBeReturnedIntoTheCorrectFormat() {
		// Map<String, Map<String, String>>
		// Map<shipName, Map<propertyName, propertyValueObject>>
	}
	@Test
	void islandListShouldBeEqualToTheExpectedList() {
		
	}
	@Test
	void cargoListShouldBeEqualToTheExpectedList() {
		
	}
	@Test
	void shipPropertiesListShouldBeEqualToTheExpectedList() {
		
	}
	@Test
	void shipListShouldBeEqualToTheExpectedList() {
		
	}
}
