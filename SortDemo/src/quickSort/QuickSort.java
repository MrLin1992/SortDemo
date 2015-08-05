package quickSort;

import insertionSort.InsertionSort;

public class QuickSort {
	private static final int MIN_SIZE = 5;

	private static <T extends Comparable<? super T>> void sortFirstMiddleLast(T[] a, int first, int mid, int last) {
		order(a, first, mid);
		order(a, mid, last);
		order(a, first, mid);
	}

	private static <T extends Comparable<? super T>> void order(T[] a, int i, int j) {
		if (a[i].compareTo(a[j]) > 0) {
			swap(a, i, j);
		}

	}

	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	private static <T extends Comparable<? super T>> int partition(T[] a, int first, int last) {
		int mid = (first + last) / 2;
		sortFirstMiddleLast(a, first, mid, last);
		swap(a, mid, last - 1);
		int pivotIndex = last - 1;
		T pivot = a[pivotIndex];

		int indexFromLeft = first + 1;
		int indexFromRight = last - 2;
		boolean done = false;
		while (!done) {
			while (a[indexFromLeft].compareTo(pivot) < 0) {
				indexFromLeft++;
			}
			while (a[indexFromRight].compareTo(pivot) > 0) {
				indexFromRight--;
			}
			if (indexFromLeft < indexFromRight) {
				swap(a, indexFromLeft, indexFromRight);
				indexFromLeft++;
				indexFromRight--;
			} else {
				done = true;
			}
		}
		swap(a, pivotIndex, indexFromLeft);
		pivotIndex = indexFromLeft;
		return pivotIndex;

	}

	public static <T extends Comparable<? super T>> void quickSort(T[] a, int first, int last) {
		if (last - first < MIN_SIZE) {
			InsertionSort.insertionSort(a, first, last);

		} else {
			int pivotIndex = partition(a, first, last);
			quickSort(a, first, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, last);
		}
	}

}
