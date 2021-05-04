package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// ince/kalýn sesli harf
				char harf = 'E';
				
				switch (harf) {
				case 'A':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Kalýn sesli harftir");
					break;
				case 'E':
				case 'Ý':
				case 'Ö':
				case 'Ü':
					System.out.println("ince sesli harftir");
					break;
				default:
					System.out.println("ince veya kalýn sesli harf deðilidir");
					break;

				}


	}

}
