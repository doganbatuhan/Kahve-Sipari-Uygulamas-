package batuhan.dogan.homework.business.concretes;

import batuhan.dogan.homework.dataaccess.abstracts.CoffeeDao;
import batuhan.dogan.homework.entities.concretes.Coffee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CoffeeManagerTest {

    CoffeeDao coffeeDao = Mockito.mock(CoffeeDao.class);
    CoffeeManager coffeeManager;

    @Before
    public void setUp() {
        coffeeManager = new CoffeeManager(coffeeDao);
    }

    @Test
    public void does_the_id_match_the_name() {
        Mockito.when(coffeeDao.get(4)).thenReturn(new Coffee(4, "Caffe Latte", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Steamed Milk", "Milk Foam"));
        Mockito.when(coffeeDao.get(3)).thenReturn(new Coffee(3, "Cappuccino", 12, "Espresso", "Steamed Milk", "Steamed Milk", "Milk Foam", "Milk Foam"));
        Assert.assertEquals(coffeeManager.getById(4).getName(), "Caffe Latte");
        Assert.assertEquals(coffeeManager.getById(3).getName(), "Cappuccino");
    }

    @Test
    public void Is_getByID_working_with_right_parameters() {
        coffeeManager.getById(4);
        Mockito.verify(coffeeDao).get(4);
    }
}
