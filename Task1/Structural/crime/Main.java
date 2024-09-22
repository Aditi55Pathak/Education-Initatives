import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        CrimeDetectionFacade facade = new CrimeDetectionFacade();
        Scanner scanner = new Scanner(System.in);

        try {
            runApplication(facade, scanner);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected error occurred", e);
        } finally {
            scanner.close();
        }
    }

    private static void runApplication(CrimeDetectionFacade facade, Scanner scanner) {
        String input;
        do {
            System.out.print("Enter crime type to report (or type 'exit' to quit): ");
            input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                logger.log(Level.INFO, "Exiting application.");
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Crime type cannot be empty.");
                }
                facade.reportCrime(input);
            } catch (IllegalArgumentException e) {
                logger.log(Level.SEVERE, "Error: " + e.getMessage(), e);
                System.out.println("Error: " + e.getMessage());
            }
        } while (!"exit".equalsIgnoreCase(input));
    }
}