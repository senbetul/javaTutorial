package friendNumber;

public class Main {

	public static void main(String[] args) {
		// Arkada� say�lar
		// 220-284 b�lenlerinin toplam� ayn� olan say�lar

		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int e = 1; e < sayi1; e++) {
			if (sayi1 % e == 0) {
				toplam1 += e;
			}
		}
		for (int r = 1; r < sayi2; r++) {
			if (sayi2 % r == 0) {
				toplam2 += r;
			}
		}
		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Arkada� say�d�r");
		}

	}

}
