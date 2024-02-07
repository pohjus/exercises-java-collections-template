package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class MargheritaPizzaTest {

    @Test
    public void testToString() {
        MargheritaPizza pizza = new MargheritaPizza();
        assertEquals("Margherita Pizza", pizza.toString());
    }

    @Test
    public void testEat() {
        MargheritaPizza pizza = new MargheritaPizza();
        assertEquals("Eating Margherita Pizza", pizza.eat());
    }
}