package loopDemo;

public class Main {

	public static void main(String[] args) {

		// (for)
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("-------------------------------");

		// (while)1 ile 10 aras� tek say�lar� yazd�rma
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("-------------------------------");

		// (do-while)
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("-------------------------------");

	}

}
