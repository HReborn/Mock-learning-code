package dsa1.introduction;

import java.util.Arrays;

public class SelectionSort {
	public int[] sort(int[] unsorted) {
		int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
		int current = 0;
		int smallest = 0;
		int temp = 0;
		while (current < sorted.length) {
			smallest = current;
			for (int i = current+1; i < sorted.length;i++) {
				if (sorted[smallest] > sorted[i]) {
					smallest = i;
				}
			}
			if (sorted[current] > sorted[smallest]) {
				temp = sorted[current];
				sorted[current] = sorted[smallest];
				sorted[smallest] = temp;
			}
			current++;
		}
		return sorted;
	}
}
