package lcode;

/**
 * 309. Best Time to Buy and Sell Stock with Cooldown
 * @author si
 *
 */

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
//
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
//After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
//Example:
//
//prices = [1, 2, 3, 0, 2]
//maxProfit = 3
//transactions = [buy, sell, cooldown, buy, sell]
		
public class BestTimetoBuyandSellStockwithCooldown {

	public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
       	int sell = 0, presell = 0, buy = Integer.MIN_VALUE, prebuy;
       	for(int p:prices) {
       		prebuy = buy;
       		buy = Math.max(prebuy, presell-p);
       		presell = sell;
       		sell = Math.max(presell, prebuy+p);
       	}
       	return sell;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock[] = {1,2,3,0,2};
		System.out.print(maxProfit(stock));
	}

}
