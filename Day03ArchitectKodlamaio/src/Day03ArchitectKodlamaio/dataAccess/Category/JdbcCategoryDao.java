package Day03ArchitectKodlamaio.dataAccess.Category;

import Day03ArchitectKodlamaio.dataAccess.Instructor.InstructorDao;
import Day03ArchitectKodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Kategori Jdbc veritabanına eklendi. " + category);
	}

}
