package algorithm.triangle;

public class Triangle1 {

	public void test() {
		int n = 10;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i) {
					System.out.println(i);
				} else {
					System.out.print(i);
				}

			}
		}
	}

	public static void main(String[] args) {
		Triangle1 triangle1 = new Triangle1();
		triangle1.test();

	}
}