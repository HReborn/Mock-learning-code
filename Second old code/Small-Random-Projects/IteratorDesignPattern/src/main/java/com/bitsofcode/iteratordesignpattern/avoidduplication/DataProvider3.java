package com.bitsofcode.iteratordesignpattern.avoidduplication;

import java.util.HashSet;
import java.util.Iterator;

public class DataProvider3 implements DataIterator {
	private HashSet<DataClass> DP3 = new HashSet<>();
	
	public DataProvider3() {
		DataClass data = new DataClass("Luna", 235233, 'h', true);
		DP3.add(data);
		DataClass data1 = new DataClass("Letícia", 947233, 'n', true);
		DP3.add(data1);
	}

	public Iterator<DataClass> getIterator() {
		return DP3.iterator();
	}

}
