package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"iPhone XR",10000);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);

	}

}