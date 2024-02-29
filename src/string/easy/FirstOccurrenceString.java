package string.easy;

// 28
public class FirstOccurrenceString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        int subCount = haystack.length() - needle.length() + 1;

        for (int i = 0; i < subCount; i++) {
            String subString = haystack.substring(i, i + needle.length());
            if (subString.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
