package com.bitsofcode.genericlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenericListTest {
	
	List<String> mockElmts;
	GenericList<String> mockList;
	String[] expected;
	Object[] values;
	
	@BeforeEach
	void setUp() {
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko2", "Loko3", "Loko4"));
		mockList = new GenericList<>();
		expected = mockElmts.toArray(new String[4]);
	}

	@Test
	void testConstructorWithVarargs() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testConstructorWithArray() {
		mockList = new GenericList<>(expected);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testConstructorWithCollections() {
		Collection<String> list = new ArrayList<>(Arrays.asList(expected));
		Collection<String> set = new HashSet<>(Arrays.asList(expected));
		mockList = new GenericList<>(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
		mockList = new GenericList<>(set);
		values = mockList.getListAsArray();
		assertTrue(Arrays.asList(values).containsAll(Arrays.asList(expected)));
		assertEquals(expected.length, values.length);
	}
	@Test
	void testConstructorWithHashSet() {
	}
	@Test
	void testConstructorWithArrayList() {
	}
	@Test
	void testConstructorWithLinkedList() {
	}
	@Test
	void testAddWithVarargs() {
	}
	@Test
	void testAddWithArray() {
	}
	@Test
	void testAddWithCollections() {
	}
	@Test
	void testAddWithHashMapShouldReturnEmpty() {
	}
	@Test
	void testAddWithHashSet() {
	}
	@Test
	void testAddWithArrayList() {
	}
	@Test
	void testAddWithLinkedList() {
	}
	@Test
	void testSingleAdd() {
	}
	@Test
	void shouldRemoveTheLoko1Element() {
	}
	@Test
	void shouldRemoveTheLoko2Element() {
	}
	@Test
	void shouldRemoveTheLoko4Element() {
	}
	@Test
	void shouldRemoveTheSecondElmt() {
	}
	@Test
	void shouldRemoveTheThirdElement() {
	}
	@Test
	void shouldRemoveTheFirstElement() {
	}
	@Test
	void shouldRemoveTheNthElement() {
	}
	@Test
	void getMethodShouldReturnIndex2() {
	}
	@Test
	void getMethodShouldReturnIndex0() {
	}
	@Test
	void getMethodShouldReturnIndex3() {
	}
	@Test
	void getMethodShouldReturn2ForLoko3Element() {
	}
	@Test
	void getMethodShouldReturn0ForLoko1Element() {
	}
	@Test
	void getMethodShouldReturn3ForLoko4Element() {
	}
	@Test
	void sizeMethodShouldReturn5() {
	}
	@Test
	void sizeMethodShouldReturn1() {
	}
	@Test
	void sizeMethodShouldReturn0() {
	}
	@Test
	void checkIfIteratorIsWorkingUsingForEach() {
	}
	@Test
	void checkIfIteratorIsWorking() {
	}
	@Test
	void checkifToStringIsReturningAllElements() {
	}
}