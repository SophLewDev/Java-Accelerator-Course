package word.guessing.game;

import java.lang.*;
import java.util.ArrayList;

public class Game {
    Integer attemptsLeft = 10;
    String word;
    ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    Masker masker;
    public Game(WordChooser chooser, Masker masker) {
        word = chooser.getRandomWordFromDictionary();
        this.masker = masker;
    }
    public static void main(String[] args) {

    }
    public String getWordToGuess() {
        return masker.getMaskedWord(word, lettersGuessed);
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

    public Boolean isGameLost() {
        if (attemptsLeft < 1) {
            System.out.println("You've lost, try again!");
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGameWon() {
        for (int i = 1; i < word.length(); i++) {
            Character letter = word.charAt(i);
            if (lettersGuessed.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
