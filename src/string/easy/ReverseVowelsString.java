package string.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// 345
public class ReverseVowelsString {
    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }

    public static String reverseVowels(String s) {
        List<Character> characters = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) characters.add(c);
        }

        Collections.reverse(characters);

        int vowelIndex = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) result.append(characters.get(vowelIndex++));
            else result.append(c);
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }

    private static boolean isVowel1(char c) {
        String vowels = "aoeiu";
        return vowels.indexOf(c) != -1;
    }

    private static final Set<Character> VOWELS = Set.of('a', 'o', 'e', 'i', 'u');
    private static boolean isVowel3(char c) {
        return VOWELS.contains(c);
    }

    private static boolean isVowel4(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    private static boolean isVowel5(char c) {
        return String.valueOf(c).toLowerCase().matches("[aeiou]");
    }

    private static boolean isVowel6(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char lower = Character.toLowerCase(c);
        for (char v : vowels) {
            if (v == lower) {
                return true;
            }
        }
        return false;
    }
}
