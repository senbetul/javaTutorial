package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// ince/kal�n sesli harf
				char harf = 'E';
				
				switch (harf) {
				case 'A':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Kal�n sesli harftir");
					break;
				case 'E':
				case '�':
				case '�':
				case '�':
					System.out.println("ince sesli harftir");
					break;
				default:
					System.out.println("ince veya kal�n sesli harf de�ilidir");
					break;

				}


	}

}
