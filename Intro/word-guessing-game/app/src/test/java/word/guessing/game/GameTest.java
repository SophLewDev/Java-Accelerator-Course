package word.guessing.game;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    @Test public void testGetsWordToGuess1() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void gameIsCreatedWithRightAttempts() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.attemptsLeft, Integer.valueOf(10));
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void returnsTrueIfLetterExistsInWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.guessLetter('E'), true);

    }
    @Test public void returnsFalseIfLetterDoesNotexistInWord() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.guessLetter('X'), false);
        assertEquals(game.attemptsLeft, Integer.valueOf(9));

    }
    @Test public void getsWordAfterGuessingOneLetterCorrect() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
        assertEquals(game.guessLetter('E'), true);
        assertEquals(game.getWordToGuess(), "DE_E___E_");
    }
    @Test public void getsWordAfterNotGuessingLetterCorrect() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
        assertEquals(game.guessLetter('X'), false);
        assertEquals(game.getWordToGuess(), "D________");
    }
    @Test public void gameIsOver() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
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
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        assertEquals(game.isGameLost(), false);
    }
    @Test public void winGameIfAllLettersGuess() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
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
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);
        game.guessLetter('E');
        game.guessLetter('V');
        game.guessLetter('L');

        assertEquals(game.isGameWon(), false);
    }

}
