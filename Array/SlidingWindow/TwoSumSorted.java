import java.util.Arrays;

/**
 * @author Mathenge on 11/12/2023
 */
public class TwoSumSorted {

    /*
    - Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that
    they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where
    1 <= index1 < index2 < numbers.length.
    - Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

     Example 1:
       Input: numbers = [2,7,11,15], target = 9
       Output: [1,2]
       Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     */

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println("Brute Force approach: " + Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println("Two pointer approach: " + Arrays.toString(twoSumOptimized(nums, target)));
    }

    private static int[] twoSumBruteForce(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == x) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[]{};
    }

    private static int[] twoSumOptimized(int[] nums, int x) {
        //initialize left pointer at index 0
        int i = 0;

        //initialize right pointer at last index
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == x) {
                return new int[] {i+1, j+1};
            } else if (nums[i] + nums[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }
}
