package batuhan.dogan.homework.dataaccess.abstracts;

import java.util.List;

import batuhan.dogan.homework.entities.concretes.Coffee;

public interface CoffeeDao {
	
	void add(Coffee coffee);
	
	void update(Coffee coffee);
	
	void delete(Coffee coffee);
	
	List<Coffee> getAll();
	
	Coffee get(int id);
	
}
