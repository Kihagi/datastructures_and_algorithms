/**
 * @author Mathenge on 11/11/2023
 */
public class BestTimeToBuyStock {

    /*
    -You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your
    profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    -Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    
    Example 1:
       Input: prices = [7,1,5,3,6,4]
       Output: 5
       Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
       Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("max profit brute force: " + maxProfitBrute(prices));
        System.out.println("max profit sliding window: " + maxProfitOptimized(prices));
    }

    static int maxProfitBrute(int[] prices) {
        int n = prices.length;

        int max_profit = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }

    static int maxProfitOptimized(int[] prices) {
        int l = 0; //buy
        int r = 1; //sell

        int max_profit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max_profit = Math.max(profit, max_profit);
            } else {
                l = r;
            }
            r++;
        }

        return max_profit;
    }

}
