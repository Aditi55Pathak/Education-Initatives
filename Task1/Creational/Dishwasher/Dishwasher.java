// Dish Washer System

// Pattern: Singleton (Creational)
// Description: Ensure that only one instance of the dishwasher is running at any time.


class Dishwasher {
    private static Dishwasher instance;

    private Dishwasher() {}

    public static Dishwasher getInstance() {
        if (instance == null) {
            instance = new Dishwasher();
        }
        return instance;
    }

    public void wash() {
        System.out.println("Washing dishes...");
    }
}
