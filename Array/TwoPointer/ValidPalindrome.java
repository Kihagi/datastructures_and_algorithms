/**
 * @author Mathenge on 11/13/2023
 */
public class ValidPalindrome {

    /*
    Leetcode: https://leetcode.com/problems/valid-palindrome/

    - A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    - Given a string s, return true if it is a palindrome, or false otherwise.

    Example 1:
     Input: s = "A man, a plan, a canal: Panama"
     Output: true
     Explanation: "amanaplanacanalpanama" is a palindrome.
     */

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindromeOptimized(str));
    }

    public static boolean isPalindromeBrute(String s) {
        //remove all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        //convert to lower case
        s = s.toLowerCase();

        //convert to character array
        char[] c = s.toCharArray();

        //create new string to compare in reverse
        String rev = "";

        for (int i = c.length - 1; i >= 0; i--) {
            rev = rev + c[i];
        }

        return s.equalsIgnoreCase(rev);
    }

    public static boolean isPalindromeOptimized(String s) {
        //remove all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        //convert to lower case
        s = s.toLowerCase();

        //convert to character array
        char[] c = s.toCharArray();

        //create 2 pointers i & j to move forward & backward respectively
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            if (c[i] != c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
