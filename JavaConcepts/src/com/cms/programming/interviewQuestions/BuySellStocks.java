package com.cms.programming.interviewQuestions;

/* say you have an array for which ith element is the price of a given stock on day i
 * Design an algorithm to find the max profit.
 * 
 *  Example 1 Input : [7, 1, 5, 3 ,6, 4] Output : 5
 *  Explanation: Buy on day 2 ( Price = 1 ) and sell on day 5 ( price = 6 ) 
 * */

public class BuySellStocks {

	public static void main(String... args) {
		int[] prices = { 7, 1, 5, 3 ,6, 4 };
		BuySellStocks bbs = new BuySellStocks();
		System.out.println(bbs.buySellStock(prices));
		bbs.calculate(prices);

	}
	
	public static int  buySellStock(int[] prices) {
		int minPriceSoFar = prices[0];
		int calculatedProfitSoFar = 0;
		for(int i = 1; i< prices.length; i++) {
			calculatedProfitSoFar = Math.max(calculatedProfitSoFar, prices[i]-minPriceSoFar );
			minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
		}
		return calculatedProfitSoFar;
	}
	
	private static void calculate(int[] prices) {
		int min = prices[0];
		int max = 0;
		
		for( int i =0 ; i < prices.length; i++) {
			if(min < prices[i]) {
				min = prices[i];
			}
			if(prices[i]-min > max) {
				max = prices[i] - min;
			}
		}
		System.out.println(max);
	}

}
