package word.guessing.game;

import java.lang.*;

public class Game {

    public Game(String word) {

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
}
