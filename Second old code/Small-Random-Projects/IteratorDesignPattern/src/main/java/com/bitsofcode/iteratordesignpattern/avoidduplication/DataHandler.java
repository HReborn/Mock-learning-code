package com.bitsofcode.iteratordesignpattern.avoidduplication;

import java.util.ArrayList;
import java.util.Iterator;

public class DataHandler {
	
	private ArrayList<Iterator<DataClass>> dataProviders = new ArrayList<>();

	public DataHandler() {
		dataProviders.add(new DataProvider1().getIterator());
		dataProviders.add(new DataProvider2().getIterator());
		dataProviders.add(new DataProvider3().getIterator());
		dataProviders.add(new DataProvider4().getIterator());
	}
	
	public DataClass findAndPrintData(String name) {
		for (Iterator<DataClass> iterator : dataProviders) {
			DataClass temp = getDataFromIterator(iterator, name);
			if (temp != null && temp.getInfoString().equals(name)) {
				System.out.println(temp);
				return temp;
			}
		}
		return null;
	}
	
	private DataClass getDataFromIterator(Iterator<DataClass> iterator, String name) {
		while (iterator.hasNext()) {
			DataClass temp = iterator.next();
			if (temp.getInfoString().equals(name)) {
				return temp;
			}
		}
		return null;
	}
}
