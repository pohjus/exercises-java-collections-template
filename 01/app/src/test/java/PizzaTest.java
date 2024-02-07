package exercise;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PizzaTest {

    @Test
    public void testEatMethod() {
        // Create a mock Pizza object
        Pizza pizza = mock(Pizza.class);

        // Define behavior for the eat method
        when(pizza.eat()).thenReturn("Eating Pizza");

        // Call the eat method
        String result = pizza.eat();

        // Verify the result
        assertEquals("Eating Pizza", result);

        // Verify interaction with the eat method
        verify(pizza).eat();
    }
}
