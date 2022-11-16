package word.guessing.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test public void testGetsWordToGuess1() {
        Game game = new Game("B_____");
        String word = "B_____";
        assertEquals(game.getWordToGuess(word), word);
    }
    @Test public void testGetsWordToGuess2() {
        Game game = new Game("Makers");
        String word = "Makers";
        assertEquals(game.getWordToGuess(word), "M_____");
    }
    @Test public void gameIsCreatedWithRightAttempts() {
        Game game = new Game("Makers");
        String word = "Makers";
        assertEquals(game.attemptsLeft, Integer.valueOf(10));
    }
}
