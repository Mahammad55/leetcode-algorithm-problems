package array.easy2;

import java.util.ArrayList;
import java.util.List;

// 119
public class PascalTriangleII {
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> resultPascalTriangle = new ArrayList<>();

        for (int i = 1; i <= rowIndex+1; i++) {
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

        return resultPascalTriangle.get(rowIndex);
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
