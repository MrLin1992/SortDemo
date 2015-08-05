package selectionSort;

public class SelectionSort {
	public static <T extends Comparable<? super T>> void selectSort(T[] a, int n) {
		for (int index = 0; index < n - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
			swap(a, index, indexOfNextSmallest);
		}
	}

	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] a, int first, int last) {
		T min = a[first];
		int indexOfMin = first;
		for (int index = first + 1; index <= last; index++) {
			if (a[index].compareTo(min) < 0) {
				min = a[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}

}
