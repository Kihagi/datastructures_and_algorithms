/**
 * @author Mathenge on 11/10/2023
 */
public class MaxSubArraySlidingWindow {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 50};
        int k = 4;
        int n = arr.length;

        int maxSum = maxSum(arr, n, k);
        System.out.println("maxSum: " + maxSum);

    }

    static int maxSum(int[] arr, int n, int k) {
        //check that n is greater than k
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        //calculate sum of the first window
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }

        //calculate sums of subsequent windows by removing first element of previous window and adding last element of current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
}
