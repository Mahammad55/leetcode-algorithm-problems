package string.hard;

import java.util.*;

// 30
public class SubstringConcatenationAllWords {
    public static void main(String[] args) {
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> finds = new ArrayList<>();
        List<String> permuattions = getPermutaions(words);
        Integer size = Arrays.stream(words).map(String::length).mapToInt(value -> value).sum();

        for (int i = 0; i < s.length() - size; i++) {
            if (permuattions.contains(s.substring(i, i + size))) finds.add(i);
        }

        return finds;
    }

    private static List<String> getPermutaions(String[] array) {
        List<String> result = new ArrayList<>();
        permute(array, 0, result);
        return result;
    }

    private static void permute(String[] array, int start, List<String> result) {
        if (start == array.length) {
            StringBuilder sb = new StringBuilder();
            for (String s : array) {
                sb.append(s);
            }
            result.add(sb.toString());
            return;
        }

        for (int i = start; i < array.length; i++) {
            swap(array, start, i);
            permute(array, start + 1, result);
            swap(array, start, i);
        }
    }

    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static List<Integer> findSubstring1(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int windowSize = wordLen * wordCount;

        if (s.length() < windowSize) return result;

        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> windowMap = new HashMap<>();

            for (int j = i; j + wordLen <= s.length(); j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (wordFreq.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (windowMap.get(word) > wordFreq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount) result.add(left);
                } else {
                    windowMap.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }

    public static List<Integer> findSubstring2(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words == null || words.length == 0 || s.length() == 0) return result;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

        if (s.length() < totalLen) return result;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                int wordStart = i + j * wordLen;
                String word = s.substring(wordStart, wordStart + wordLen);
                if (!wordCount.containsKey(word)) break;
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if (seen.get(word) > wordCount.get(word)) break;
                j++;
            }
            if (j == words.length) result.add(i);
        }

        return result;
    }
}
