package string.medium;

// 151
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder reverseString = new StringBuilder();
        s = s.trim();

        String[] array = s.split("\\s");
        for (int i = 0; i < array.length; i++) {
            if (!array[array.length - 1 - i].isEmpty())
                reverseString.append(array[array.length - 1 - i]).append(" ");
        }

        return reverseString.toString().trim();
    }

    public String reverseWords1(String s) {
        StringBuilder reverseString = new StringBuilder();
        s = s.trim();

        String[] array = s.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            reverseString.append(array[array.length - 1 - i]).append(" ");
        }

        return reverseString.toString().trim();
    }
}
