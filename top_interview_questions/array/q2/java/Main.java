public class Main {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}
