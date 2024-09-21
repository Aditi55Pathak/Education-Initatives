
public class TextEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        String emotion = analyzeText(input);
        System.out.println("Emotion detected from text: " + emotion);
    }

    private String analyzeText(String input) {
        // Simple keyword-based emotion detection just for basic implementation
        if (input.contains("happy")) return "Happiness";
        if (input.contains("sad")) return "Sadness";
        return "Neutral";
    }
}
