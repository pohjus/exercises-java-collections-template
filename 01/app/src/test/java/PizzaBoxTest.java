package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaBoxTest {

    @Test
    public void testGetPizza_Margherita() {
        MargheritaPizza margheritaPizza = new MargheritaPizza();
        PizzaBox<MargheritaPizza> box = new PizzaBox<>(margheritaPizza);

        assertNotNull("The pizza in the box should not be null", box.getPizza());
        assertEquals("The pizza should be a Margherita Pizza", "Margherita Pizza", box.getPizza().toString());
    }

    @Test
    public void testServePizza_Margherita() {
        MargheritaPizza margheritaPizza = new MargheritaPizza();
        PizzaBox<MargheritaPizza> box = new PizzaBox<>(margheritaPizza);

        String result = PizzaBox.servePizza(box);
        assertEquals("Serving Margherita Pizza", result);
    }

    @Test
    public void testGetPizza_Pepperoni() {
        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        PizzaBox<PepperoniPizza> box = new PizzaBox<>(pepperoniPizza);

        assertNotNull("The pizza in the box should not be null", box.getPizza());
        assertEquals("The pizza should be a Pepperoni Pizza", "Pepperoni Pizza", box.getPizza().toString());
    }

    @Test
    public void testServePizza_Pepperoni() {
        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        PizzaBox<PepperoniPizza> box = new PizzaBox<>(pepperoniPizza);

        String result = PizzaBox.servePizza(box);
        assertEquals("Serving Pepperoni Pizza", result);
    }
}
