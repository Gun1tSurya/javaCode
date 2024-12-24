package leetCode;

public class BestTimeToBuyAndSellStock1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(calculateProfit(prices));
    }

    private static int calculateProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];

        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            profit = Math.max(profit,price-minPrice);
        }

        return profit;
    }
}
