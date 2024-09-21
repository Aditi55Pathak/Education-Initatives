
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrimeDetectionFacade facade = new CrimeDetectionFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter crime type to report (or type 'exit' to quit): ");
            String crimeType = scanner.nextLine();

            if ("exit".equalsIgnoreCase(crimeType)) {
                System.out.println("Exiting application.");
                break;
            }

            try {
                if (crimeType.trim().isEmpty()) {
                    throw new IllegalArgumentException("Crime type cannot be empty.");
                }
                facade.reportCrime(crimeType);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
