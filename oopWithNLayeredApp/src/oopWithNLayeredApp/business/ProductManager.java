package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	public void Add(Product product) throws Exception { 
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün Fiyatı 10'dan küçük olamaz. ");
			
		}
			
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.Add(product);
	}

}
