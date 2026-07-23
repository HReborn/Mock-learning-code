package dsa1.introduction;

public class InsertionSort {
	
	public int[] sort(int[] unsorted) {
		int[] sorted = new int[unsorted.length];
		sorted = unsorted;
		for (int i = 1; i < unsorted.length; i++) { 
			int j = i;
			int current = sorted[j];
			int leftItem = sorted[j-1];
			while (j>0 && current < leftItem) {
				sorted[j] = leftItem;
				sorted[j-1] = current;
				j--;
				try {
					leftItem = unsorted[j-1];
				} catch (ArrayIndexOutOfBoundsException ex) {
					break;
				}
			}
		}
		
		return sorted;
	}
}
