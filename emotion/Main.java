// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmotionContext context = new EmotionContext();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select measurement type (1 for Text, 2 for Voice, 0 to Exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                System.out.println("Exiting application.");
                break;
            }

            System.out.print("Enter input: ");
            String input = scanner.nextLine();

            switch (choice) {
                case 1:
                    context.setStrategy(new TextEmotionStrategy());
                    break;
                case 2:
                    context.setStrategy(new VoiceEmotionStrategy());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            context.measure(input);
        }

        scanner.close();
    }
}
