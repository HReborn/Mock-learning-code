package dsa1.introduction;

import java.util.Arrays;

public class MergeSort {
	
	// Exists to avoid sorting in-place
	private int[] sorted;
	// Exists to reference the original position when sorting
	
	public int[] sort(int[] unsorted) {
		this.sorted = Arrays.copyOf(unsorted, unsorted.length);
		int[] result = mergeSort(sorted);
		return result;
	}
	
	public int[] mergeSort(int[] original) {
		
		// divide
		int[][] dividedArray = divide(original);
		int[] a = dividedArray[0];
		int[] b = dividedArray[1];
		
		// recursive sorting part
		if (a.length > 2) {
			a = mergeSort(a);
		}
		if (b.length > 2) {
			b = mergeSort(b);
		}
		
		// join both
		int ogLeng = original.length;
		int[] result = new int[original.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < ogLeng) {
			if (a[i] < b[j]) {
				result[k] = a[i];
				i++;
			} else {
				result[k] = b[j];
				j++;
			}
			k++;
		}
		return result;
	}
	
	private int[][] divide(int[] original) {
		if (original.length == 3) {
			int[] a = {original[0], original[1]};
			int[] b = {original[2]};
			return new int[][] {a, b};
		}
		int leng = original.length;
		int half = (int) Math.ceil(leng/2);
		return new int[][] {
			Arrays.copyOfRange(original, 0, half-1),
			Arrays.copyOfRange(original, half, leng-1)
		};
	}
}