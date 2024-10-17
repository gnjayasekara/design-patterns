package nima.design_patterns.factory_method;

public class CheesePizzaRestaurant extends Restaurant {
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
