
public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2,2.5,3.8,6.3,9.6};
		
		double total = 0; //Listedeki sayıların Toplamını bulmak için bir değer verdik
		double max = myList[0];
		
		for (double numbers:myList) {
			if (max<numbers) {
				max = numbers;
				
			}
			total = total + numbers;
			System.out.println(numbers);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);

	}

}
