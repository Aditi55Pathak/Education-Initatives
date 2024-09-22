import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            runApplication(scanner);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected error occurred", e);
        } finally {
            scanner.close();
        }
    }

    private static void runApplication(Scanner scanner) {
        String input;
        do {
            System.out.print("Enter restaurant type (Fast Food, Fine Dining) or type 'exit' to quit: ");
            input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting the restaurant system.");
                break;
            }

            Restaurant restaurant = RestaurantFactory.createRestaurant(input);
            if (restaurant != null) {
                restaurant.serve();
            } else {
                System.out.println("Invalid restaurant type. Please enter 'Fast Food' or 'Fine Dining'.");
            }
        } while (!"exit".equalsIgnoreCase(input));
    }
}