package string.easy;

import java.util.ArrayList;
import java.util.List;

// 500
public class KeywordRow {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();
        for (String word : words) {
            String wordLower = word.toLowerCase();
            boolean inRow1 = true, inRow2 = true, inRow3 = true;

            for (char c : wordLower.toCharArray()) {
                if (!row1.contains(String.valueOf(c))) {
                    inRow1 = false;
                }

                if (!row2.contains(String.valueOf(c))) {
                    inRow2 = false;
                }

                if (!row3.contains(String.valueOf(c))) {
                    inRow3 = false;
                }
            }

            if (inRow1 || inRow2 || inRow3) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
