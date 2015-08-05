package shellSort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		ShellSort.shellSort(a, 0, 9);
		for (Integer i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);

	}

}
