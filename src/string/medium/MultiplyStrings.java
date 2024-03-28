package string.medium;

import java.math.BigInteger;

// 43
public class MultiplyStrings {
    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {
        BigInteger integer1 = new BigInteger(num1);
        BigInteger integer2 = new BigInteger(num2);
        return integer1.multiply(integer2).toString();
    }
}
