package batuhan.dogan.homework.business.abstracts;

import java.util.List;

import batuhan.dogan.homework.entities.concretes.Coffee;

public interface CoffeeService {
	
	void add(Coffee coffee);
	List<Coffee> getAll();
	Coffee getById(int id);
	void enjoyYourCoffee(Coffee coffee);
}
