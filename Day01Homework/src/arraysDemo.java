
public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1="Ömer";
		String ogrenci2="Furkan";
		String ogrenci3="Erdem";
		String ogrenci4="Yasin";
		
		/*System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);*/
		
		String[] ogrencıler = new String[3];
		
		ogrencıler[0] = "Ömer";
		ogrencıler[1] = "Erdem";
		ogrencıler[2] = "Yasin";
		
		for (int i = 0; i < ogrencıler.length; i++) {
			System.out.println(ogrencıler[i]);
			
		}
		

	}

}
