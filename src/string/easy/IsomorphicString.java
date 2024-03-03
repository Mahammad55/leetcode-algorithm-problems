package string.easy;

// 205
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        char[] c1 = s.toCharArray(); // e g g
        char[] c2 = t.toCharArray();//  a d d

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < t.length(); j++) {
                if (c1[i] == c1[j] && c2[i] != c2[j]) {
                    return false;
                } else if (c1[i] != c1[j] && c2[i] == c2[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
