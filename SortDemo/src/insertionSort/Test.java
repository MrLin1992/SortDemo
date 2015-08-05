package insertionSort;

public class Test {

	public static void main(String[] args) {
		Integer[] a = { 5, 4, 3, 2, 1, 22, 33, 555, 2, 13, 5, 7, 45 };
		InsertionSort.insertionSort(a, 0, 12);
		for (Integer i : a) {
			System.out.println(i);
		}

	}

}
