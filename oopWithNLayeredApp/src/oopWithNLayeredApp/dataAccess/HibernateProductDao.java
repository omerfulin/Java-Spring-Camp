package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void Add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi. ");
		
	}

}
