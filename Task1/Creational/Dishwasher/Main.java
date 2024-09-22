import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dishwasher dishwasher = Dishwasher.getInstance();

        try {
            runApplication(dishwasher, scanner);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected error occurred", e);
        } finally {
            scanner.close();
        }
    }

    private static void runApplication(Dishwasher dishwasher, Scanner scanner) {
        String command;
        do {
            System.out.print("Enter command (wash/exit): ");
            command = scanner.nextLine();

            if ("wash".equalsIgnoreCase(command)) {
                try {
                    dishwasher.wash();
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Error during washing process", e);
                }
            } else if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Exiting the dishwasher system.");
            } else {
                System.out.println("Invalid command. Please enter 'wash' or 'exit'.");
            }
        } while (!"exit".equalsIgnoreCase(command));
    }
}