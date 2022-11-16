package word.guessing.game;

public class WordChooser {

    public static final String[] DICTIONARY={"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public WordChooser() {
        String word = getRandomWordFromDictionary();
    }
    public static void main(String[] args) {}
    public String getRandomWordFromDictionary() {
        int index = (int)(Math.random() * DICTIONARY.length);
        return DICTIONARY[index];
    }
}
