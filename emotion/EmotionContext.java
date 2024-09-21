// EmotionContext.java
class EmotionContext {
    private EmotionStrategy strategy;

    public void setStrategy(EmotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void measure(String input) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set. Please set a strategy before measuring.");
        }
        strategy.measureEmotion(input);
    }
}
