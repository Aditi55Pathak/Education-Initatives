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
