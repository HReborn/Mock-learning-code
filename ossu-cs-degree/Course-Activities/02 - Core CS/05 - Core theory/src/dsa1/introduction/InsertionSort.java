package dsa1.introduction;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] sort(int[] unsorted) {
		int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
		for (int i = 1; i < sorted.length; i++) { 
			int j = i;
			int current = sorted[j];
			int leftItem = sorted[j-1];
			while (j>0 && current < leftItem) {
				sorted[j] = leftItem;
				sorted[j-1] = current;
				j--;
				try {
					leftItem = sorted[j-1];
				} catch (ArrayIndexOutOfBoundsException ex) {
					break;
				}
			}
		}
		
		return sorted;
	}
}
