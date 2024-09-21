import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter restaurant type (Fast Food, Fine Dining) or type 'exit' to quit: ");
            String input = scanner.nextLine();

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
        }

        scanner.close();
    }
}
