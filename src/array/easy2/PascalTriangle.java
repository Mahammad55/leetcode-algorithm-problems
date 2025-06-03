package array.easy2;

import java.util.ArrayList;
import java.util.List;

// 118
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultPascalTriangle = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> subTriangle = new ArrayList<>();

            if (i == 1) subTriangle.add(1);
            else if (i == 2) {
                subTriangle.add(1);
                subTriangle.add(1);
            } else {
                subTriangle = createNew(resultPascalTriangle.get(i - 2));
            }

            resultPascalTriangle.add(subTriangle);
        }

        return resultPascalTriangle;
    }

    private static List<Integer> createNew(List<Integer> previous) {
        // previous [1,2,1]  new [1,3,3,1]
        List<Integer> newOne = new ArrayList<>();

        for (int i = 0; i <= previous.size(); i++) {
            if (i == 0) newOne.add(previous.get(0));
            else if (i == previous.size()) newOne.add(previous.get(previous.size() - 1));
            else {
                newOne.add(previous.get(i - 1) + previous.get(i));
            }

        }

        return newOne;
    }
}
