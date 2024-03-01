package array.easy;

import java.util.ArrayList;
import java.util.List;

// 2942
public class FindWordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.contains(String.valueOf(x))) {
                list.add(i);
            }
        }

        return list;
    }
}
