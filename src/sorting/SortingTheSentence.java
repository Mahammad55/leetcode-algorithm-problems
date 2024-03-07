package sorting;

import java.util.Arrays;

// 1859
public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] split = s.split("\\s");
        int length = split.length;
        char[] array = new char[length];
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : split) {
            array[index++] = string.charAt(string.length() - 1);
        }

        Arrays.sort(array);

        for (int i = 0; i < length; i++) {
            for (String s1 : split) {
                if (array[i] == s1.charAt(s1.length() - 1)) {
                    stringBuilder.append(s1, 0, s1.length() - 1).append(" ");
                }
            }
        }

        return stringBuilder.toString().trim();
    }
}
