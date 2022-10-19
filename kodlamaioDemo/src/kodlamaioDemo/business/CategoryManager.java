package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	
	public CategoryDao categoryDao;
	public Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	List<Category> categories = new ArrayList<>();
	
	public void add(Category category) throws Exception {
		for (Category cr : categories) {
			if (cr.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name can not be same");
			}
		}
	}
	
	public void update(Category category) {
		for(Category cr: categories) {
			if (cr.getCategoryName().equals(category.getCategoryName())) {
				
			}
		}
	}
	public void delete(Category category) {
		for(Category cr: categories) {
			if (cr.getCategoryName().equals(category.getCategoryName())) {
			}
		}
		
	}

}
