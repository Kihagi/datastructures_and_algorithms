/**
 * @author Mathenge on 11/10/2023
 */
public class MaximumSubarrayBruteForce {

    /*
    - Given an array of integers of size 'n', our aim is to calculate the maximum sum of 'k' consecutive
    elements in the array.

    Example:
       Input: arr[] = {100, 200, 300, 400}, k = 2
       Output: 700
     */

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;

        System.out.println(maxSum(arr, k));
    }

    static int maxSum(int[] arr, int k) {
        int n = arr.length;

        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j <= k - 1; j++) {
                current_sum  = current_sum + arr[i + j];
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;

    }
}
