package word.guessing.game;

import java.lang.*;
import java.util.ArrayList;

public class Game {
    Integer attemptsLeft = 10;
    String word;
    ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    public Game(WordChooser chooser) {
        word = chooser.getRandomWordFromDictionary();
    }
    public static void main(String[] args) {

    }
    public String getWordToGuess() {
        StringBuilder sb = new StringBuilder(word);

        for (int i = 1; i < word.length(); i++) {
            sb.replace(i, word.length(), "_" );
        }
        return sb.toString();
    }

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            lettersGuessed.add(letter);
            return true;
        } else {
            attemptsLeft--;
            return false;
        }
    }
}
