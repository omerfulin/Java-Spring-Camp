
public class loopDemo {

	public static void main(String[] args) {
		//For loop
		for (int i = 1;  i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		//While loop
		
		int i = 0;
		while(i<10) {
			i+=1; // int++
			System.out.println(i);
		}
		System.out.println("While Döngüsü Bitti");

		// Do-While loop
		int j=1;
		do {
			j+=2;
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}		

}
