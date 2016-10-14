package lcode;

/**
 * 123. Best Time to Buy and Sell Stock III
 * @author smeng
 *
 */

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete at most two transactions.
//
//Note:
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

public class BestTimetoBuyandSellStockIII {

	public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) {
        	return 0;
        }
        int min = prices[0];
        int left[] = new int[prices.length];
        for(int i=1; i<prices.length; i++) {
        	min = Math.min(min, prices[i]);
        	left[i] = Math.max(left[i-1], prices[i]-min);
        }
        int max = prices[prices.length-1];
        int right[] = new int[prices.length];
        for(int i=prices.length-2; i>=0; i--) {
        	max = Math.max(max, prices[i]);
        	right[i] = Math.max(right[i+1], max-prices[i]);
        }
        int profit = 0;
        for(int i=0; i<prices.length; i++) {
        	profit = Math.max(profit, left[i]+right[i]);
        }
        return profit;
    }
	public static int maxProfit2(int[] prices) {
        int firstbuy = Integer.MIN_VALUE, firstsell = 0;
        int secondbuy = Integer.MIN_VALUE, secondsell = 0;
        for(int p: prices) {
        	if(firstbuy<-p) firstbuy = -p;
        	if(firstsell<firstbuy+p) firstsell = firstbuy+p;
        	if(secondbuy<firstsell-p) secondbuy = firstsell-p;
        	if(secondsell<secondbuy+p) secondsell = secondbuy+p;
        }
        return secondsell;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock = {1,5,3,2,5,1,7};
		int profit = maxProfit2(stock);
		System.out.print(profit);
	}

}
