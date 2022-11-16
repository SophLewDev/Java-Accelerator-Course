package word.guessing.game;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;



public class WordChooserTest {

    @Test public void shouldGetRandomWordFromDictionary() {
        WordChooser chooser = new WordChooser();
        String[] MOCKDICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

        assertTrue(Arrays.asList(MOCKDICTIONARY).contains(chooser.getRandomWordFromDictionary()));
    }

}
