package nima.design_patterns.factory_method;


public class Main {
    public static void main(String[] args) {
        Restaurant cheeseRest = new CheesePizzaRestaurant();
        Pizza cheesePizza = cheeseRest.orderPizza();

        Restaurant veggieRest = new VeggiePizzaRestaurant();
        Pizza veggiePizza = veggieRest.orderPizza();






    }
}