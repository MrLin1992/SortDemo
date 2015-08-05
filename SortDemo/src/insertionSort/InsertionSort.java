package insertionSort;

public class InsertionSort {
	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int first, int last) {
		for (int index = first + 1; index <= last; index++) {
			T firstUnsorted = a[index];
			insertInOrder(firstUnsorted, a, index - 1);
		}
	}

	private static <T extends Comparable<? super T>> void insertInOrder(T firstUnsorted, T[] a, int index) {
		while ((index >= 0) && (firstUnsorted.compareTo(a[index]) < 0)) {
			a[index + 1] = a[index];
			index--;
		}
		a[index + 1] = firstUnsorted;

	}

}
