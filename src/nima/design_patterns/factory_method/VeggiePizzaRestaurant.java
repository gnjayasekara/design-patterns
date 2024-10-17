package nima.design_patterns.factory_method;

public class VeggiePizzaRestaurant extends Restaurant {
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}
