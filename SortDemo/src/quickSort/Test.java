package quickSort;

public class Test {

	public static void main(String[] args) {
		Integer[]a = {10,9,8,7,6,5,4,3,2,1};
		QuickSort.quickSort(a, 0, 9);
		for(Integer i:a){
			System.out.println(i);
		}
	}
}
