package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entites.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
	
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1 , "Mercedes"));
		brands.add(new Brand(2 , "Aston Martin"));
		brands.add(new Brand(3 , "Audi"));
		brands.add(new Brand(4 , "BMW"));
		brands.add(new Brand(5 , "Porsche"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}