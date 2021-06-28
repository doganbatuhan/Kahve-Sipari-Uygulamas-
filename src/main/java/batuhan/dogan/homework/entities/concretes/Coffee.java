package batuhan.dogan.homework.entities.concretes;

import batuhan.dogan.homework.entities.abstracts.Entity;

public class Coffee implements Entity {
	private int id;
	private String name;
	private double price;
	private String[] ingredient;

	public Coffee(int id, String name, double price, String... ingredient) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ingredient = ingredient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String[] getIngredient() {
		return ingredient;
	}

	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
}
