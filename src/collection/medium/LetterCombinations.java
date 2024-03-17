package collection.medium;

import java.util.ArrayList;
import java.util.List;

// 17
public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();

        if (digits == null || digits.length() == 0) return resultList;

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        generateCombinations(digits, mapping, resultList, "", 0);

        return resultList;
    }

    private static void generateCombinations(String digits, String[] mapping, List<String> resultList, String current, int index) {
        if (index == digits.length()) {
            resultList.add(current);
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, mapping, resultList, current + letter, index + 1);
        }
    }
}
