package lcode;

/**
 * 188. Best Time to Buy and Sell Stock IV
 * @author si
 *
 */

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete at most k transactions.
//
//Note:
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

public class BestTimetoBuyandSellStockIV {
	
	public static int maxProfit(int k, int[] prices) {
        if(k<1||prices==null||prices.length<2) return 0;
        int len = prices.length;
        int profit = 0;
        if(k>=len/2) { // make transactions as many times as you can
        	for(int i=1; i<len; i++) {
        		if(prices[i]>prices[i-1]){
        			profit += prices[i] - prices[i-1];
        		}
        	}
        	return profit;
        }else {
        	int dp[][] = new int[k+1][len];
        	for(int i=1; i<=k; i++) {
        		int localmax = -prices[0]; //buy at first day
        		for(int j=1; j<len; j++) {
        			//compare profit of sell yesterday or today
        			dp[i][j] = Math.max(dp[i][j-1],prices[j]+localmax);
        			//local max profit is buy(yesterday's profit + today price) today or not
        			localmax = Math.max(localmax, dp[i-1][j-1]-prices[j]);
        		}
        	}
        	return dp[k][len-1];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,3,2,5,6,4,3,2};
		int profit = maxProfit(2, prices);
		System.out.println(profit);
	}

}
