package com.bitsofcode.genericlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class GenericListTest {
	
	List<String> mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko2", "Loko3", "Loko4"));
	String[] expected = mockElmts.toArray(new String[4]);
	GenericList<String> mockList;
	Object[] values;

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
		Set<String> set = new HashSet<>(Arrays.asList(expected));
		mockList = new GenericList<>(set);
		values = mockList.getListAsArray();
		assertTrue(Arrays.asList(values).containsAll(Arrays.asList(expected)));
		assertEquals(expected.length, values.length);
	}
	@Test
	void testConstructorWithArrayList() {
		List<String> list = new ArrayList<>(Arrays.asList(expected));
		mockList = new GenericList<>(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testConstructorWithLinkedList() {
		List<String> list = new LinkedList<>(Arrays.asList(expected));
		mockList = new GenericList<>(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testAddWithVarargs() {
		mockList = new GenericList<>();
		mockList.add("Loko1", "Loko2", "Loko3", "Loko4");
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testAddWithArray() {
		mockList = new GenericList<>();
		mockList.add(expected);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testAddWithCollections() {
		Collection<String> list = new ArrayList<>(Arrays.asList(expected));
		Collection<String> set = new HashSet<>(Arrays.asList(expected));
		mockList = new GenericList<>();
		mockList.add(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
		mockList = new GenericList<>();
		mockList.add(set);
		values = mockList.getListAsArray();
		assertTrue(Arrays.asList(values).containsAll(Arrays.asList(expected)));
		assertEquals(expected.length, values.length);
	}
	@Test
	void testAddWithHashSet() {
		Set<String> set = new HashSet<>(Arrays.asList(expected));
		mockList = new GenericList<>();
		mockList.add(set);
		values = mockList.getListAsArray();
		assertTrue(Arrays.asList(values).containsAll(Arrays.asList(expected)));
		assertEquals(expected.length, values.length);
	}
	@Test
	void testAddWithArrayList() {
		List<String> list = new ArrayList<>(Arrays.asList(expected));
		mockList = new GenericList<>();
		mockList.add(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testAddWithLinkedList() {
		List<String> list = new LinkedList<>(Arrays.asList(expected));
		mockList = new GenericList<>();
		mockList.add(list);
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void testSingleAdd() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3");
		mockList.add("Loko4");
		values = mockList.getListAsArray();
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheLoko1Element() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove("Loko1");
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko2", "Loko3", "Loko4"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheLoko2Element() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove("Loko2");
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko3", "Loko4"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheLoko4Element() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove("Loko4");
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko2", "Loko3"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheSecondElmt() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove(1);
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko3", "Loko4"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheThirdElement() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove(2);
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko2", "Loko4"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheFirstElement() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove(0);
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko2", "Loko3", "Loko4"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void shouldRemoveTheLastElement() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		mockList.remove(mockList.getSize() - 1);
		values = mockList.getListAsArray();
		mockElmts = new ArrayList<>(Arrays.asList("Loko1", "Loko2", "Loko3"));
		expected = mockElmts.toArray(new String[3]);
		assertArrayEquals(expected, values);
	}
	@Test
	void getMethodShouldReturnIndex2() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		int index = mockList.getIndex("Loko3");
		assertEquals(2, index);
	}
	@Test
	void getMethodShouldReturnIndex0() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		int index = mockList.getIndex("Loko1");
		assertEquals(0, index);
	}
	@Test
	void getMethodShouldReturnIndex3() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		int index = mockList.getIndex("Loko4");
		assertEquals(3, index);
	}
	@Test
	void getMethodShouldReturnLoko3ForIndex2() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		String item = mockList.get(2);
		assertEquals("Loko3", item);
	}
	@Test
	void getMethodShouldReturnLoko1ForIndex0() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		String item = mockList.get(0);
		assertEquals("Loko1", item);
	}
	@Test
	void getMethodShouldReturnLoko4ForIndex3() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4");
		String item = mockList.get(3);
		assertEquals("Loko4", item);
	}
	@Test
	void sizeMethodShouldReturn5() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4", "Loko5");
		int size = mockList.getSize();
		assertEquals(5, size);
	}
	@Test
	void sizeMethodShouldReturn1() {
		mockList = new GenericList<>("Loko5");
		int size = mockList.getSize();
		assertEquals(1, size);
	}
	@Test
	void sizeMethodShouldReturn0() {
		mockList = new GenericList<>();
		int size = mockList.getSize();
		assertEquals(0, size);
	}
	@SuppressWarnings("unused")
	@Test
	void checkIfIteratorIsWorkingUsingForEach() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4", "Loko5");
		for (String elmt : mockList) {
			//if it passes, it works
		}
		assertTrue(true);
	}
	@Test
	void checkIfIteratorIsWorking() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4", "Loko5");
		Iterator<String> iter = mockList.iterator();
		while (iter.hasNext()) {
			iter.next(); //if it passes, it works
		}
		assertTrue(true);
	}
	@Test
	void checkifToStringIsReturningAllElements() {
		mockList = new GenericList<>("Loko1", "Loko2", "Loko3", "Loko4", "Loko5");
		String value = mockList.toString();
		String expect = "Loko1\nLoko2\nLoko3\nLoko4\nLoko5\n";
		assertEquals(expect, value);
	}
}