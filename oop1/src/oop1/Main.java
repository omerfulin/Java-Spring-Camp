package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("iamge1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smag Kahve Makinesi");
		product2.setDiscount(10);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(7);
		product2.setImageUrl("iamge2.jpg");

		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(9);
		product3.setImageUrl("iamge3.jpg");

		
		Product[] products = {product1,product2,product3};

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05322222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Ömer");
		individualCustomer.setLastName("Fulin");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05533333");
		corporateCustomer.setTaxNumber("111111");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};

	}

}