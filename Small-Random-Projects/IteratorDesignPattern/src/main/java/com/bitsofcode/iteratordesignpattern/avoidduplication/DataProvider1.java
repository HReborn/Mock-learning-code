package com.bitsofcode.iteratordesignpattern.avoidduplication;

import java.util.ArrayList;
import java.util.Iterator;

public class DataProvider1 implements DataIterator {
	private ArrayList<DataClass> DP1 = new ArrayList<>();
	
	public DataProvider1() {
		DataClass data = new DataClass("Luana", 934643, 'q', true);
		DP1.add(data);
		DataClass data1 = new DataClass("Camila", 843643, 'l', false);
		DP1.add(data1);
	}

	public Iterator<DataClass> getIterator() {
		return DP1.iterator();
	}


}
