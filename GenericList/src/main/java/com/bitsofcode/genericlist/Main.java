package com.bitsofcode.genericlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		GenericList<String> arr = new GenericList<>("loko1", "loko2");
		String[] toba = {"loko1","loko2"};
		Object[] tob = arr.getListAsArray();
		boolean result = Arrays.equals(toba,tob);
		System.out.println(result);
	}	
}