package stringDemo;

public class Main {

	public static void main(String[] args) {
		// string1
		String mesaj = "Bug�n hava �ok g�zel.";

		System.out.println("Eleman say�s� :" + mesaj.length());// 21
		System.out.println("5. eleman:" + mesaj.charAt(4)); // n 4.karakteri bulma
		System.out.println(mesaj.concat(" Ya�as�n!")); // string birle�tirme
		System.out.println(mesaj.startsWith("b"));// false metinin ba� harfi b�y�k B oldu�u i�in false
		System.out.println(mesaj.endsWith(".")); // true metinin son de�erine bakar.

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));// karakteri aramaya ba�tan ba�lar
		System.out.println(mesaj.lastIndexOf("a"));// sondan ba�lar

		System.out.println("-------------------------------");

		// string2
		System.out.println(mesaj.replace("g�zel", "k�t�"));
		System.out.println(mesaj.substring(2, 5));// 2. indexten 5. indexe kadar keser

		for (String kelime : mesaj.split(" ")) {// bo�lu�a g�re metini par�alar
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());// metinde ki harfleri k���lt�r
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// bo�luklar� kald�r�r

	}

}
