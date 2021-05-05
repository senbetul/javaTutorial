package searchNumber;

public class Main {

	public static void main(String[] args) {
		// Sayý bulma
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 8 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayý bulunuyor.");
		}

	}

}
