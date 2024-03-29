package array.easy2;

import java.util.Arrays;
import java.util.Collections;

// 414
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 2, -2147483648}));
    }

    public static int thirdMax(int[] nums) {
        int thirdMax;
        int[] distinctArray = Arrays
                .stream(nums)
                .distinct()
                .toArray();

        if (distinctArray.length < 3)
            thirdMax = Arrays
                    .stream(nums)
                    .max()
                    .getAsInt();

        else
            thirdMax = Arrays
                    .stream(distinctArray)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .skip(2)
                    .findFirst()
                    .get();

        return thirdMax;
    }
}
