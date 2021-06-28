package batuhan.dogan.homework.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import batuhan.dogan.homework.business.concretes.CoffeeManager;
import batuhan.dogan.homework.dataaccess.concretes.XCoffeeDao;
import batuhan.dogan.homework.entities.concretes.Coffee;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Coffee coffees[] = {
				new Coffee(1, "Espresso", 7, "Espresso"),
				new Coffee(2, "Double Espresso", 12, "Espresso", "Espresso"),
				new Coffee(3, "Cappuccino", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Milk Foam", "Milk Foam"),
				new Coffee(4, "Caffe Latte", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Steamed Milk", "Milk Foam"),
				new Coffee(5, "Mocha", 13, "Espresso", "Stemaed Milk", "Milk Foam", "Hot Chocolate"),
				new Coffee(6, "Americano", 10, "Espresso", "Hot Water", "Hot Water", "Hot Water", "Hot Water"),
				new Coffee(7, "Hot Water", 3, "Hot Water", "Hot Water", "Hot Water", "Hot Water", "How Water"),
				};
		
		CoffeeManager coffeeManager = new CoffeeManager(new XCoffeeDao(new ArrayList<Coffee>()));
		for (Coffee coffee : coffees) {
			coffeeManager.add(coffee);
		}
		
		for (Coffee coffee : coffeeManager.getAll()) {
			System.out.printf("%d. %s (%.0f %s) \n" , coffee.getId(), coffee.getName(), coffee.getPrice(), "₺");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
		int id = scanner.nextInt();

		System.out.println("Teşekkürler kahveniz hazırlanıyor.");

		Thread.sleep(1000);
		Coffee coffee = coffeeManager.getById(id);

		coffeeManager.enjoyYourCoffee(coffee);

		
	}

}
