package batuhan.dogan.homework.business.concretes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import batuhan.dogan.homework.business.abstracts.CoffeeService;
import batuhan.dogan.homework.dataaccess.abstracts.CoffeeDao;
import batuhan.dogan.homework.entities.concretes.Coffee;

public class CoffeeManager implements CoffeeService {

	// Dependency Injection
	// Lossy coupled
	CoffeeDao coffeeDao;
		
	public CoffeeManager(CoffeeDao coffeeDao) {
		this.coffeeDao = coffeeDao;
	}

	@Override
	public List<Coffee> getAll() {
		return coffeeDao.getAll();
	}

	@Override
	public Coffee getById(int id) {

		return coffeeDao.get(id);
	}

	@Override
	public void enjoyYourCoffee(Coffee coffee) {

	}

	@Override
	public void add(Coffee coffee) {
		coffeeDao.add(coffee);
	}
	



}
