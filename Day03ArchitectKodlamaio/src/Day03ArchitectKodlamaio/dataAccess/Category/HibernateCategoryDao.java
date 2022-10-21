package Day03ArchitectKodlamaio.dataAccess.Category;

import Day03ArchitectKodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate veritabanına eklendi. " +category);
		
	}

}
