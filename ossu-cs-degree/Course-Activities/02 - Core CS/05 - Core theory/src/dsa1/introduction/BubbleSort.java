package dsa1.introduction;

public class BubbleSort {
	public int[] sort(int[] unsorted) {
		int[] sorted = unsorted;
		int swaps = 0;
		int temp = 0;
		while (swaps != 0) {
			swaps = 0;
			for (int i = 0; i < sorted.length; i++) {
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
