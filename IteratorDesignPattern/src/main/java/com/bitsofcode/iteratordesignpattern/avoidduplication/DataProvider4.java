package com.bitsofcode.iteratordesignpattern.avoidduplication;

import java.util.Iterator;
import java.util.Arrays;

public class DataProvider4 implements DataIterator {
	private DataClass[] DP4 = new DataClass[2];
	
	public DataProvider4() {
		DataClass data = new DataClass("Marcondes", 123423, 'p', false);
		DP4[0] = data;
		DataClass data1 = new DataClass("Marcos", 903423, 'v', true);
		DP4[1] = data1;
	}
	
	public Iterator<DataClass> getIterator() {
		return Arrays.asList(DP4).iterator();
	}
}
