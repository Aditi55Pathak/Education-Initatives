// VoiceEmotionStrategy.java
class VoiceEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        System.out.println("Measuring emotion from voice: " + input);
    }
}
