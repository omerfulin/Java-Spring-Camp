
public class Main {

	public static void main(String[] args) {
		Customermanager customermanager = new Customermanager();
		customermanager.Add();
		customermanager.Remove();
		customermanager.Update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int [] sayilar1 = new int[] {1,2,3};
		int [] sayilar2 = new int[] {4,5,6};
		
		sayilar2 = sayilar1;
		sayilar1 [0] = 10;
		System.out.println(sayilar2[0]);

		
		System.out.println("--------------------------------------");
	
		
		
		reCapDemo_classDortIslem dortIslem = new reCapDemo_classDortIslem();
		int sonuc = dortIslem.Topla(3,4);
		System.out.println(sonuc);
			
		
		
	}	 

}
