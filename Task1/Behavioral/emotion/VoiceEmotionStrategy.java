
public class VoiceEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        // In a real application, you'd analyze the voice input here if possible
        System.out.println("Measuring emotion from voice: " + input);
    }
}
