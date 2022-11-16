package word.guessing.game;

import java.lang.*;
import java.util.ArrayList;

public class Game {
    Integer attemptsLeft = 10;
    String word;
    public static final String[] DICTIONARY={"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    public Game() {
        word = getRandomWordFromDictionary();
    }
    public static void main(String[] args) {

    }
    public String getWordToGuess(String word) {
        StringBuilder sb = new StringBuilder(word);

        for (int i = 1; i < word.length(); i++) {
            sb.replace(i, word.length(), "_" );
        }
        return sb.toString();
    }
    public String getRandomWordFromDictionary() {
        int index = (int)(Math.random() * DICTIONARY.length);
        return DICTIONARY[index];
    }
}
