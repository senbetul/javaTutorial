package arraysDemp;

public class Main {

	public static void main(String[] args) {
		// diziler1
		String ogrenci1 = "Betül";
		String ogrenci2 = "Ayþe";
		String ogrenci3 = "Fatma";
		String ogrenci4 = "Hayriye";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		String[] Ogrenciler = new String[3];
		Ogrenciler[0] = "Betül";
		Ogrenciler[1] = "Ayþe";
		Ogrenciler[2] = "Fatma";

		for (int y = 0; y < Ogrenciler.length; y++) {
			System.out.println(Ogrenciler[y]);
		}

		System.out.println("-------------------------------");

		// diziler2
		double[] myList = { 1.2, 1.3, 4.3 };
		double total = 0;
		for (double number : myList) {
			total = total + number;
			System.out.println(number);
		}
		System.out.println("toplam=" + total);

		System.out.println("-------------------------------");

		// diziler3 Multi Dimensional Array
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Çankýrý";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Antep";
		sehirler[2][2] = "Urfa";

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.println(sehirler[a][b]);
			}
			System.out.println("!!!!");
		}

		System.out.println("-------------------------------");

	}

}
