package kodlama.io.rentACar.dataAccess.concretes;

import java.util.List;

import kodlama.io.rentACar.dataAccess.abstratcs.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class InMemoryBrandRepository implements BrandRepository{

	
	List<Brand> brands;

	public InMemoryBrandRepository() {
	}

	@Override
	public List<Brand> getAll() {
		
		return null;
	}

}
