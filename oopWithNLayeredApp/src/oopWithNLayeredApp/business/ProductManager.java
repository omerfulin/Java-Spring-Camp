package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	public ProductDao productDao;
	public Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao,  Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	


	public void Add(Product product) throws Exception   {
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
			
		}
		
		productDao.Add(product);
		
		for (Logger logger : loggers) {
			logger.Log(product.getName());
		}
		
	}
	
	

}
