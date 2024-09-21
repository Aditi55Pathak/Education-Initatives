// Use Cases and Patterns
// Food Restaurant

// Pattern: Factory Method (Creational)
// Description: Create a system for generating different types of restaurants (e.g., Fast Food, Fine Dining).

// Restaurant.java (Abstract Class)
abstract class Restaurant {
    abstract void serve();
}

// FastFoodRestaurant.java
class FastFoodRestaurant extends Restaurant {
    @Override
    void serve() {
        System.out.println("Serving fast food!");
    }
}

// FineDiningRestaurant.java
class FineDiningRestaurant extends Restaurant {
    @Override
    void serve() {
        System.out.println("Serving fine dining!");
    }
}

// RestaurantFactory.java
class RestaurantFactory {
    static Restaurant createRestaurant(String type) {
        switch (type) {
            case "Fast Food":
                return new FastFoodRestaurant();
            case "Fine Dining":
                return new FineDiningRestaurant();
            default:
                return null;
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = RestaurantFactory.createRestaurant("Fast Food");
        restaurant.serve();
    }
}
