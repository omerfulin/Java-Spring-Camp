
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
		//reCapDemo_classAttributes
		
		
		reCapDemo_classDortIslem dortIslem = new reCapDemo_classDortIslem();
		int sonuc = dortIslem.Topla(3,4);
		System.out.println(sonuc);
		
		
		System.out.println("--------------------------------------");
		// classesWithAttributes
		
		
		Product product = new Product(1,"Laptop","Asus Laptop",7500,3); //Parametleri Constructor
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop"); 
		product.setPrice(7500);
		product.setStockAmount(3);*/
		
		System.out.println(product.getDescription());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		//System.out.println(product.name);
		
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		//inheritance 
		
		inheritanceCustomer customer = new inheritanceCustomer();
		inheritanceEmployee employee = new inheritanceEmployee();
		
		inheritanceEmployeeManager employeeManager = new inheritanceEmployeeManager();
		inheritanceCustomerManager customerManager = new inheritanceCustomerManager();
		customermanager.Add();
		employeeManager.BestEmployee();
		
		
				
		
	}	 

}
