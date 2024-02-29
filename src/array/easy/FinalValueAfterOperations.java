package array.easy;

// 2011
public class FinalValueAfterOperations {
    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String s : operations) {
            switch (s.charAt(1)) {
                case '+' -> count++;
                case '-' -> count--;
            }
        }
        return count;
    }
}
