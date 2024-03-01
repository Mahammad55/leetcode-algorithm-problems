package array.easy;

// 2114
public class MaximumNumberOfWords {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            int count = sentence.split(" ").length;

            if (max < count) {
                max = count;
            }
        }

        return max;
    }
}
