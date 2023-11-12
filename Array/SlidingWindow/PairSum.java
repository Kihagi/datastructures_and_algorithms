/**
 * @author Mathenge on 11/12/2023
 */
public class PairSum {

    /*
    Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j])
     such that their sum is equal to X.
     */

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4 };
        int x = 6;

        System.out.println(isPairSum(arr, x));
    }

    private static int isPairSum(int[] arr, int x) {
        //first pointer at index 0
        int i = 0;

        //2nd pointer at last index
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return 1;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }
}
