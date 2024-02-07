package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Exercise 1.
 */
public final class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    private App() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        var pizzabox1 = new PizzaBox<PepperoniPizza>(new PepperoniPizza());
        var pizzabox2 = new PizzaBox<MargheritaPizza>(new MargheritaPizza());


        LOG.info(PizzaBox.servePizza(pizzabox1));
        LOG.info(pizzabox1.getPizza().eat());
        LOG.info(PizzaBox.servePizza(pizzabox2));
        LOG.info(pizzabox2.getPizza().eat());
    }
}
