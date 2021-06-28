package batuhan.dogan.homework.dataaccess.concretes;

import java.util.List;

import batuhan.dogan.homework.dataaccess.abstracts.CoffeeDao;
import batuhan.dogan.homework.entities.concretes.Coffee;

public class XCoffeeDao implements CoffeeDao {

	private List<Coffee> coffees;
	
	public XCoffeeDao(List<Coffee> coffees) {
		this.coffees = coffees;
	}
	
	@Override
	public void add(Coffee coffee) {
		coffees.add(coffee);
	}

	@Override
	public void update(Coffee coffee) {
		coffees.set(coffee.getId()-1, coffee);
	}

	@Override
	public void delete(Coffee coffee) {
		coffees.remove(coffee);
		
	}

	@Override
	public List<Coffee> getAll() {
		// TODO Auto-generated method stub
		return coffees;
	}

	@Override
	public Coffee get(int id) {
		// TODO Auto-generated method stub
		for (Coffee coffee : coffees) {
			if (coffee.getId() == id) {
				return coffee;
			}
		}
		return null;
	}

}
