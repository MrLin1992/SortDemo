package mergeSort;

public class MergeSort {
	public static <T extends Comparable<? super T>> void publicMergeSort(T[] a, int first, int last) {
		T[] tempArray = (T[]) new Comparable<?>[a.length];
		mergeSort(a, tempArray, first, last);
	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] tempArray, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(a, tempArray, first, mid);
			mergeSort(a, tempArray, mid + 1, last);
			merge(a, tempArray, first, mid, last);
		}

	}

	private static <T extends Comparable<? super T>> void merge(T[] a, T[] tempArray, int first, int mid, int last) {
		int beginHalf1 = first;
		int endHalf1 = mid;
		int beginHalf2 = mid + 1;
		int endHalf2 = last;
		int index = 0;
		while ((beginHalf1 <= endHalf1) && (beginHalf2 <= endHalf2)) {
			if (a[beginHalf1].compareTo(a[beginHalf2]) < 0) {
				tempArray[index] = a[beginHalf1];
				beginHalf1++;
			} else {
				tempArray[index] = a[beginHalf2];
				beginHalf2++;
			}
			index++;
		}

		if (beginHalf1 > endHalf1) {
			for (int i = index,j=beginHalf2; i <= last-first; i++,j++) {
				tempArray[i] = a[j];
			}
		} else {
			for (int i = index,j=beginHalf1; i <= last-first; i++,j++) {
				tempArray[i] = a[j];
			}
		}

		for (int j = first, k = 0; j <= last; j++, k++) {
			a[j] = tempArray[k];
		}
	}

}
