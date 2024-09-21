// Emotion Measuring

// Pattern: Strategy (Behavioral)
// Description: Different strategies for measuring emotions based on user input (e.g., text analysis, voice analysis).

// EmotionStrategy.java
interface EmotionStrategy {
    void measureEmotion(String input);
}

// TextEmotionStrategy.java
class TextEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        System.out.println("Measuring emotion from text: " + input);
    }
}

// VoiceEmotionStrategy.java
class VoiceEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        System.out.println("Measuring emotion from voice: " + input);
    }
}

// EmotionContext.java
class EmotionContext {
    private EmotionStrategy strategy;

    public void setStrategy(EmotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void measure(String input) {
        strategy.measureEmotion(input);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        EmotionContext context = new EmotionContext();
        
        context.setStrategy(new TextEmotionStrategy());
        context.measure("I am happy!");
        
        context.setStrategy(new VoiceEmotionStrategy());
        context.measure("I am sad.");
    }
}
