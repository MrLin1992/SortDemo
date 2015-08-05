package mergeSort;

public class Test {

	public static void main(String[] args) {
		Integer[] a ={5,4,31,5,9,1};
		MergeSort.publicMergeSort(a, 0, 5);
		for(Integer i:a){
			System.out.println(i);
		}
	}
}
