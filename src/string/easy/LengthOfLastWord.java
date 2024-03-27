package string.easy;

// 58
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] split = s.split("\\s");
        return split[split.length - 1].length();
    }

    public int lengthOfLastWord1(String s) {
        int ans = 0;
        String[] arr = s.split(" ");

        for (String string : arr) {
            ans = string.length();
        }
        return ans;
    }

    public int lengthOfLastWord2(String s) {
        return s.split("\\s+")[s.split("\\s+").length - 1].length();
    }

    public int lengthOfLastWord3(String s) { // "Hello Java"
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public int lengthOfLastWord4(String s) { // "Hello Java"
        return s.trim().isEmpty() ? 0 : s.trim().substring(s.trim().lastIndexOf(" ") + 1).length();
    }
}
