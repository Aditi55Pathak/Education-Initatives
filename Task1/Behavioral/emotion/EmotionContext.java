
public class EmotionContext {
    private EmotionStrategy strategy;

    public void setStrategy(EmotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void measure(String input) {
        if (strategy == null) {
            System.out.println("No strategy set.");
            return;
        }
        strategy.measureEmotion(input);
    }
}
