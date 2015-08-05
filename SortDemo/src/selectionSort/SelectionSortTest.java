package selectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		Student a = new Student(3, "marry");
		Student b = new Student(1, "bob");
		Student c = new Student(5, "shelly");
		Student d = new Student(2, "Calear");
		Student e = new Undergradute(7, "AAA", 2014);
		Undergradute f = new Undergradute(4, "d", 221);
		Student[] list = { a, b, c, d, e, f };
		SelectionSort.selectSort(list, 6);
		for (Student s : list) {
			System.out.println(s.getName());
		}
	}
}
