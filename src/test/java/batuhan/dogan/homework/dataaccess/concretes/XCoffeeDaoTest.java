package batuhan.dogan.homework.dataaccess.concretes;


import batuhan.dogan.homework.entities.concretes.Coffee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class XCoffeeDaoTest {

    XCoffeeDao xCoffeeDao;

    @Before
    public void setUp() {
        Coffee coffees[] = {
                new Coffee(1, "Espresso", 7, "Espresso"),
                new Coffee(2, "Double Espresso", 12, "Espresso", "Espresso"),
                new Coffee(3, "Cappuccino", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Milk Foam", "Milk Foam"),
        };
        xCoffeeDao = new XCoffeeDao(new ArrayList<>(Arrays.asList(coffees)));
    }

    @Test
    public void add() {
        Assert.assertNull(xCoffeeDao.get(4));
        xCoffeeDao.add(new Coffee(4, "Caffe Latte", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Steamed Milk", "Milk Foam"));
        Assert.assertNotNull(xCoffeeDao.get(4));
    }

    @Test
    public void update() {
        Assert.assertEquals(xCoffeeDao.get(3).getName(), "Cappuccino");
        xCoffeeDao.add(new Coffee(4, "Caffe Latte", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Steamed Milk", "Milk Foam"));
        xCoffeeDao.update(xCoffeeDao.get(4));
        Assert.assertEquals(xCoffeeDao.get(3).getName(), "Cappuccino");
    }

    @Test
    public void delete() {
        Assert.assertNotNull(xCoffeeDao.get(3));
        xCoffeeDao.delete(xCoffeeDao.get(3));
        Assert.assertNull(xCoffeeDao.get(3));
    }
}