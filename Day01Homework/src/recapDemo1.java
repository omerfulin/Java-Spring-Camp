
public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 50;
		int sayi2 = 60;
		int sayi3 = 40;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En Büyük Sayı : " + enBuyuk);

	}

}
