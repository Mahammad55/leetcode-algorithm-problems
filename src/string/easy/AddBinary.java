package string.easy;

import java.math.BigInteger;

// 67
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary1("11", "1"));
    }

    public static String addBinary(String a, String b) {
        Integer num1 = Integer.parseInt(a, 2);
        Integer num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    public static String addBinary1(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger add = num1.add(num2);
        return add.toString(2);
    }
}
