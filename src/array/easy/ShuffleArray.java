package array.easy;

// 1470
public class ShuffleArray {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            shuffleArray[index++] = nums[i];
            shuffleArray[index++] = nums[i + n];
        }

        return shuffleArray;
    }

    public int[] shuffle1(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];

        int j = 0;
        int k = n;

        for (int i = 0; i < nums.length; i += 2) {
            shuffleArray[i] = nums[j++];
        }

        for (int i = 1; i < nums.length; i += 2) {
            shuffleArray[i] = nums[k++];
        }
        return shuffleArray;
    }
}
