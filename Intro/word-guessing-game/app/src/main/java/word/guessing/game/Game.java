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
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                // first letter is always shown
                sb.append(currentLetter);
            } else {
                // show letter only if it was already guessed
                if (lettersGuessed.indexOf(currentLetter) != -1) {
                    sb.append(currentLetter);
                } else {
                    sb.append("_");
                }
            }
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
