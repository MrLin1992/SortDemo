package shellSort;

public class ShellSort {
	public static <T extends Comparable<? super T>> void incrementalInsert(T[] a, int first, int last, int space) {
		int unsorted, index;
		for (unsorted = first + space; unsorted <= last; unsorted = unsorted + space) {
			T firstUnsorted = a[unsorted];
			for (index = unsorted - space; (index >= first)
					&& (firstUnsorted.compareTo(a[index]) < 0); index = index - space) {
				a[index + space] = a[index];
			}
			a[index + space] = firstUnsorted;
		}
	}

	public static <T extends Comparable<? super T>> void shellSort(T[] a, int first, int last) {
		int n = last - first + 1;
		for (int space = n / 2; space > 0; space = space / 2) {
			for (int begin = first; begin < first + space; begin++) {
				incrementalInsert(a, begin, last, space);
			}
		}
	}
}
