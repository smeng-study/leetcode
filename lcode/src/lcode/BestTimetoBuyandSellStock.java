package lcode;
/**
 * 121. Best Time to Buy and Sell Stock
 * @author smeng
 *
 */

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//Example 1:
//Input: [7, 1, 5, 3, 6, 4]
//Output: 5
//
//max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
//Example 2:
//Input: [7, 6, 4, 3, 1]
//Output: 0
//
//In this case, no transaction is done, i.e. max profit = 0.

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		if(prices==null||prices.length==0) return 0;
		int len = prices.length;
		int buymax[] = new int[len];
		buymax[len-1] = prices[len-1];
		int profit = 0;
        
        for(int i=len-2; i>=0; i--) {
        	buymax[i] = prices[i]>buymax[i+1]? prices[i]:buymax[i+1];
        }
        for(int i=0; i<len; i++) {
        	profit = Math.max(profit,(buymax[i]-prices[i]));
        }
        return profit;
    }
	public static int maxProfit2(int[] prices) {
		if(prices==null||prices.length==0) return 0;
		int min = prices[0];
		int max = 0;
		for(int i=1; i<prices.length; i++) {
			max = Math.max(max, prices[i]-min);
			min = Math.min(min, prices[i]);
		}
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock[] = {7, 1, 5, 3, 6, 4};
		int stock2[] = {7, 6, 4, 3, 1};
		System.out.println(maxProfit2(stock));
	}

}
