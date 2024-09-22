import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LeaveApplication leaveApplication = new LeaveApplication();
        leaveApplication.attach(new HRDepartment());

        try (Scanner scanner = new Scanner(System.in)) {
            runApplication(leaveApplication, scanner);
        }
    }

    private static void runApplication(LeaveApplication leaveApplication, Scanner scanner) {
        String input;
        do {
            System.out.print("Enter student name to submit leave application (or type 'exit' to quit): ");
            input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                logger.log(Level.INFO, "Exiting application.");
                break;
            }

            try {
                leaveApplication.submitApplication(input);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error submitting leave application", e);
            }
        } while (!"exit".equalsIgnoreCase(input));
    }
}