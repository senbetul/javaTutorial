package stringDemo;

public class Main {

	public static void main(String[] args) {
		// string1
		String mesaj = "Bugün hava çok güzel.";

		System.out.println("Eleman sayýsý :" + mesaj.length());// 21
		System.out.println("5. eleman:" + mesaj.charAt(4)); // n 4.karakteri bulma
		System.out.println(mesaj.concat(" Yaþasýn!")); // string birleþtirme
		System.out.println(mesaj.startsWith("b"));// false metinin baþ harfi büyük B olduðu için false
		System.out.println(mesaj.endsWith(".")); // true metinin son deðerine bakar.

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));// karakteri aramaya baþtan baþlar
		System.out.println(mesaj.lastIndexOf("a"));// sondan baþlar

		System.out.println("-------------------------------");

		// string2
		System.out.println(mesaj.replace("güzel", "kötü"));
		System.out.println(mesaj.substring(2, 5));// 2. indexten 5. indexe kadar keser

		for (String kelime : mesaj.split(" ")) {// boþluða göre metini parçalar
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());// metinde ki harfleri küçültür
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// boþluklarý kaldýrýr

	}

}
