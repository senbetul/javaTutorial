package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// asal say�lar� bulma
		int number = 25;

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("Say� asal de�ildir");
			return;
		}
		if (number < 1) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		for (int z = 2; z < number; z++) {
			if (number % z == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Say� asald�r");
		} else {
			System.out.println("Say� asal de�ildir");
		}

	}

}
