import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmotionContext context = new EmotionContext();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Select measurement type (1 for Text, 2 for Voice, 'exit' to Exit): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting application.");
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                System.out.print("Enter input: ");
                String userInput = scanner.nextLine();

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

                context.measure(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }
        }

        scanner.close();
    }
}
