import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dishwasher dishwasher = Dishwasher.getInstance();

        while (true) {
            System.out.print("Enter command (wash/exit): ");
            String command = scanner.nextLine();

            if ("wash".equalsIgnoreCase(command)) {
                dishwasher.wash();
            } else if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Exiting the dishwasher system.");
                break;
            } else {
                System.out.println("Invalid command. Please enter 'wash' or 'exit'.");
            }
        }

        scanner.close();
    }
}
