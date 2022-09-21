
public class switchDemo {

	public static void main(String[] args) {
		char not = 'F';
		
		switch (not) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok Güzel : Geçtiniz ");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değiş : Sorumlu Geçtiniz");
				break;
			case 'F':
				System.out.println("Malesef Kaldınız");
				break;
			
			default:
				System.out.println("Geçersiz Not Girdiniz");
		}
		

	}

}
