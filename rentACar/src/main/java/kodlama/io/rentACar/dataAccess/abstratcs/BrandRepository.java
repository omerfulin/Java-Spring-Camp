package kodlama.io.rentACar.dataAccess.abstratcs;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();

}
