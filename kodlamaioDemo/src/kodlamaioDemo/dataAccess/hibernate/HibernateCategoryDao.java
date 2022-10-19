package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category Hibernate eklendi." + category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category Hibernate güncellendi." + category.getCategoryName());
	
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category Hibernate silindi." + category.getCategoryName());
		
	}

}
