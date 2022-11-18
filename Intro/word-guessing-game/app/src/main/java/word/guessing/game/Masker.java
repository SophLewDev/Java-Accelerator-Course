package word.guessing.game;

import java.util.ArrayList;

public class Masker {

   String word;
   public String getMaskedWord(String word, ArrayList<Character> lettersGuessed) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                sb.append(currentLetter);
            } else {
                if (lettersGuessed.indexOf(currentLetter) != -1) {
                    sb.append(currentLetter);
                } else {
                    sb.append("_");
                }
            }
        }
        return sb.toString();
    }

}
