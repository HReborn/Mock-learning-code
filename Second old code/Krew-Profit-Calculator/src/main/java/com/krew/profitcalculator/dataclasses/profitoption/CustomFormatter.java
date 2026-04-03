package com.krew.profitcalculator.dataclasses.profitoption;

public class CustomFormatter {

	public static String capitalize(String string) {
		return string.substring(0, 1).toUpperCase() + string.substring(1);
	}
	
	public static String secondsToMinutesWithSeconds(Number time) {
		int t = time.intValue();
		return String.valueOf((t/60) + "m" + Math.round(t%60) + "s");
	}
	
	public static String add_k_ToBigNumbers(Number number) {
		int n = number.intValue();
		if (n > 1000) {
			return String.valueOf(n/1000) + "k";
		} else {
			return String.valueOf(n);
		}
	}
}
