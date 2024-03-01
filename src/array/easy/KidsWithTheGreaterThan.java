package array.easy;

import java.util.ArrayList;
import java.util.List;

// 1431
public class KidsWithTheGreaterThan {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        boolean isGreater;
        int sum;

        for (int candie : candies) {
            isGreater = true;
            sum = candie + extraCandies;
            for (int ii : candies) {
                if (ii > sum) {
                    isGreater = false;
                    break;
                }
            }
            list.add(isGreater);
        }

        return list;
    }
}
