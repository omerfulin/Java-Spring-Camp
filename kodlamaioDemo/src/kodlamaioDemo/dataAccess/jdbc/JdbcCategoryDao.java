package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category JDBC eklendi" + category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category JDBC güncellendi." + category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category JDBC silindi." + category.getCategoryName());
		
	}

}
