package Day03ArchitectKodlamaio.business;

import Day03ArchitectKodlamaio.core.logging.Logger;
import Day03ArchitectKodlamaio.dataAccess.Category.CategoryDao;
import Day03ArchitectKodlamaio.entities.Category;
import Day03ArchitectKodlamaio.entities.Course;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}



	public void add(Category category) throws Exception {
			if (category.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori adı aynı olamaz. ");		
		}
		
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
}
