package word.guessing.game;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    @Test public void testGetsWordToGuess() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);
        ArrayList<Character> result = new ArrayList<Character>();
        when(mockedMasker.getMaskedWord("DEVELOPER", result)).thenReturn("D________");
        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void gameIsCreatedWithRightAttempts() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);

        assertEquals(game.attemptsLeft, Integer.valueOf(10));
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);

        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        ArrayList<Character> result = new ArrayList<Character>();
        when(mockedMasker.getMaskedWord("DEVELOPER", result)).thenReturn("D________");

        Game game = new Game(mockedChooser, mockedMasker);

        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void returnsTrueIfLetterExistsInWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);

        assertEquals(game.guessLetter('E'), true);

    }
    @Test public void returnsFalseIfLetterDoesNotexistInWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);

        assertEquals(game.guessLetter('X'), false);
        assertEquals(game.attemptsLeft, Integer.valueOf(9));

    }
    @Test public void getsWordAfterGuessingOneLetterCorrect() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        ArrayList<Character> result = new ArrayList<Character>();
        when(mockedMasker.getMaskedWord("DEVELOPER", result)).thenReturn("DE_E___E_");


        Game game = new Game(mockedChooser, mockedMasker);
        game.guessLetter('E');
        result.add('E');
        assertEquals(game.getWordToGuess(), "DE_E___E_");
    }
    @Test public void getsWordAfterNotGuessingLetterCorrect() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        ArrayList<Character> result = new ArrayList<Character>();
        when(mockedMasker.getMaskedWord("DEVELOPER", result)).thenReturn("D________");

        Game game = new Game(mockedChooser, mockedMasker);
        assertEquals(game.guessLetter('X'), false);
        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void gameIsOver() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        assertEquals(game.isGameLost(), true);
    }

    @Test public void gameIsNotOver() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        assertEquals(game.isGameLost(), false);
    }
    @Test public void winGameIfAllLettersGuess() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);
        game.guessLetter('E');
        game.guessLetter('V');
        game.guessLetter('L');
        game.guessLetter('O');
        game.guessLetter('P');
        game.guessLetter('R');

        assertEquals(game.isGameWon(), true);
    }
    @Test public void shouldReturnFalseIfNotAllLettersGuessed() {
        WordChooser mockedChooser = mock(WordChooser.class);
        Masker mockedMasker = mock(Masker.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser, mockedMasker);
        game.guessLetter('E');
        game.guessLetter('V');
        game.guessLetter('L');

        assertEquals(game.isGameWon(), false);
    }

}
