package com.bitsofcode.iteratordesignpattern.avoidduplication;

import java.util.HashMap;
import java.util.Iterator;

public class DataProvider2 implements DataIterator {
	private HashMap<String, DataClass> DP2 = new HashMap<>();
	
	
	public HashMap<String, DataClass> getDP2() {
		return DP2;
	}

	public DataProvider2() {
		DataClass data = new DataClass("Rafael", 928364, 'c', false);
		DP2.put("Rafael", data);
		DataClass data1 = new DataClass("Kotlin", 923414, 'k', false);
		DP2.put("Kotlin", data1);
	}
	
	public Iterator<DataClass> getIterator() {
		return DP2.values().iterator();
	}
}
