package dsa1.introduction;

import java.util.Arrays;

public class BubbleSort {
	public int[] sort(int[] unsorted) {
		int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
		int swaps = -1;
		int temp = 0;
		while (swaps != 0) {
			swaps = 0;
			for (int i = 0; i < sorted.length-1; i++) {
				if (sorted[i] > sorted[i+1]) {
					temp = sorted[i+1];
					sorted[i+1] = sorted[i];
					sorted[i] = temp;
					swaps++;
				}
			}
		}
		return sorted;
	}
}