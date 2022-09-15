package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		int vade = 12;
		int vade1 = 13;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.15;
		
		boolean dolarDustuMu = false;
		
		String okYonu ="";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
		//array
		String[] krediler = {"Hızlı kredi", "Maaşını Bankadan", "Mutlu Emekli"};
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		

	}

}
