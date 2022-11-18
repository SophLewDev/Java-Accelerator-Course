package word.guessing.game;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaskerTest {

    @Test public void testGetsMaskedWordToGuess() {
        Masker masker = new Masker();
        ArrayList<Character> lettersGuessed = new ArrayList<Character>();
        assertEquals(masker.getMaskedWord("DEVELOPER", lettersGuessed), "D________");
    }
    @Test public void getsWordAfterGuessingOneLetterCorrect() {
        Masker masker = new Masker();
        ArrayList<Character> lettersGuessed = new ArrayList<Character>();
        lettersGuessed.add('E');
        assertEquals(masker.getMaskedWord("DEVELOPER", lettersGuessed), "DE_E___E_");
    }

}
