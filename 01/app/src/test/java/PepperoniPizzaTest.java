package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class PepperoniPizzaTest {

    @Test
    public void testToString() {
        PepperoniPizza pizza = new PepperoniPizza();
        assertEquals("Pepperoni Pizza", pizza.toString());
    }

    @Test
    public void testEat() {
        PepperoniPizza pizza = new PepperoniPizza();
        assertEquals("Eating Pepperoni Pizza", pizza.eat());
    }
}
