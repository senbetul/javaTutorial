package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// asal sayýlarý bulma
		int number = 25;

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz sayý");
			return;
		}
		for (int z = 2; z < number; z++) {
			if (number % z == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayý asaldýr");
		} else {
			System.out.println("Sayý asal deðildir");
		}

	}

}
