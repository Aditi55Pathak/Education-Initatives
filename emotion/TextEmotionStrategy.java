// TextEmotionStrategy.java
class TextEmotionStrategy implements EmotionStrategy {
    @Override
    public void measureEmotion(String input) {
        System.out.println("Measuring emotion from text: " + input);
    }
}
