package dsa1.introduction;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		int[] unsorted = {
		                  42, 87, 12, 65, 3, 99, 21, 54, 78, 31,
		                  9, 88, 61, 19, 47, 73, 5, 92, 36, 50,
		                  14, 83, 27, 69, 95, 8, 41, 76, 58, 23,
		                  90, 2, 44, 70, 33, 85, 11, 60, 17, 53,
		                  80, 29, 66, 6, 91, 38, 72, 55, 25, 49
		                };
		int [] sorted = {
		                 2, 3, 5, 6, 8, 9, 11, 12, 14, 17,
		                 19, 21, 23, 25, 27, 29, 31, 33, 36, 38,
		                 41, 42, 44, 47, 49, 50, 53, 54, 55, 58,
		                 60, 61, 65, 66, 69, 70, 72, 73, 76, 78,
		                 80, 83, 85, 87, 88, 90, 91, 92, 95, 99
						};
		long x = 1234;
		long y = 5678;
		int result = 7006652;
		
		KaratsubaMultiplication karaMult = new KaratsubaMultiplication();
		InsertionSort insertionSort = new InsertionSort();
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		
		long karaMultResult = karaMult.multiply(x, y);
		int[] insertionSortResult = insertionSort.sort(unsorted);
		int[] bubbleSortResult = bubbleSort.sort(unsorted);
		int[] selectionSortResult = selectionSort.sort(unsorted);
		
		// This print exists to avoid unsync in the console
		System.out.println();
		
		if (karaMultResult != result) {
			System.out.println();
			System.out.println("Karatsuba multiplication: ");
			throw new Exception("Estás a brincar comigo trouxa? Resultado do grade school foi: " + karaMultResult + ", mas o resultado esperado era: " + result + ".");
		} else {
			System.out.println("1. Grade school funcionou perfeitamente com o resultado de: " + karaMultResult);
		}
		
		if (!Arrays.equals(insertionSortResult, sorted)) {
			System.out.println();
			System.out.println("Insertion Sort result: ");
			System.out.println("unsorted: " + Arrays.toString(unsorted));
			System.out.println("result  : " + Arrays.toString(insertionSortResult));
			System.out.println("expected: " + Arrays.toString(sorted));
			throw new Exception("Estás a brincar comigo trouxa? Os arrays não são iguais!! O insertion sort está errado!");
		} else {
			System.out.println("2. Aí sim, manolo. Mandou bem pakas implementando o insertion sort. O array está bunitin e igual.");
		}
		
		if (!Arrays.equals(bubbleSortResult, sorted)) {
			System.out.println();
			System.out.println("Bubble Sort result: ");
			System.out.println("unsorted: " + Arrays.toString(unsorted));
			System.out.println("result  : " + Arrays.toString(bubbleSortResult));
			System.out.println("expected: " + Arrays.toString(sorted));
			throw new Exception("Estás a brincar comigo trouxa? Os arrays não são iguais!! O bubble sort está errado!");
		} else {
			System.out.println("3. Aí sim, manolo. Mandou bem pakas implementando o bubble sort. O array está bunitin e igual.");
		}
		
		if (!Arrays.equals(selectionSortResult, sorted)) {
			System.out.println();
			System.out.println("Selection Sort result: ");
			System.out.println("unsorted: " + Arrays.toString(unsorted));
			System.out.println("result  : " + Arrays.toString(selectionSortResult));
			System.out.println("expected: " + Arrays.toString(sorted));
			throw new Exception("Estás a brincar comigo trouxa? Os arrays não são iguais!! O selection sort está errado!");
		} else {
			System.out.println("4. Aí sim, manolo. Mandou bem pakas implementando o selection sort. O array está bunitin e igual.");
		}
	}	
}