package string.easy;

// 1816
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(array[i]).append(" ");
        }

        return result.toString().trim();
    }
}
