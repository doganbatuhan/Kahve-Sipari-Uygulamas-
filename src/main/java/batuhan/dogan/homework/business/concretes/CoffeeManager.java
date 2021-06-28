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
		System.out.print(coffee.getName() + " seçtiniz. Bu iceceğimiz ");
		getIngredients(coffee);
		System.out.println(" içermektedir. Afiyet Olsun");
	}

	@Override
	public void add(Coffee coffee) {
		coffeeDao.add(coffee);
	}

	// Hangi malzemeden kaç doz kullanildigini hesaplayan metod
	private void getIngredients(Coffee coffee) {
		List<String> ingredients = new ArrayList<String>();
		for (String string : coffee.getIngredient()) {
			ingredients.add(string);
		}
		Map<String, Integer> frequencyMap = new HashMap<>();
		for (String s: ingredients)
		{
			Integer count = frequencyMap.get(s);
			if (count == null) {
				count = 0;
			}

			frequencyMap.put(s, count + 1);
		}

		for (Map.Entry<String, Integer> entry: frequencyMap.entrySet()) {
			//System.out.print(entry.getKey() + ": " + entry.getValue());
			System.out.print(entry.getValue() + " doz " + entry.getKey() + " ");

		}
	}


}
