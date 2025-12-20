package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class buyAndSellTimeTest {
    @Test
    void maxProfitTest(){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(prices.length);

        System.out.println("max profit:: "+maxProfit(prices));
    }
    private int maxProfit(int[] prices){
        int buy =0;
        int profit=0;
        for(int sell=1; sell< prices.length; sell++){
            if(prices[buy] - prices[sell] > profit){
                profit = prices[buy] - prices[sell];
            }
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
        }
        return profit;
    }
}
