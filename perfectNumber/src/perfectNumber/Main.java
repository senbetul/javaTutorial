package perfectNumber;

public class Main {

	public static void main(String[] args) {
		// M�kemmel say�lar
		// 6 -->1,2,3 28 -->1,2,4,7,14

		int number = 6;
		int total = 0;
		for (int w = 1; w < number; w++) {
			if (number % w == 0) {
				total += w;
			}
		}
		if (total == number) {
			System.out.println("M�kemmel say�d�r");
		} else {
			System.out.println("M�kemmel say� de�ildir");
		}

	}

}
