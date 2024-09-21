import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create a basic report
            Report report = new BasicReport();

            // Input for location
            System.out.print("Enter location: ");
            String location = scanner.nextLine();
            report = new LocationDecorator(report, location);

            // Input for additional information
            System.out.print("Enter additional info: ");
            String additionalInfo = scanner.nextLine();
            report = new AdditionalInfoDecorator(report, additionalInfo);

            // Print the final report description
            System.out.println(report.getDescription());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
