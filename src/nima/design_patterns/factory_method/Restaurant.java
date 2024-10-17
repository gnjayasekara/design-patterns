package nima.design_patterns.factory_method;

public abstract class Restaurant {
    public Pizza orderPizza() {
        Pizza pizza =  createPizza();
        pizza.prepare();
        return pizza;
    }
    public abstract Pizza createPizza();
}
