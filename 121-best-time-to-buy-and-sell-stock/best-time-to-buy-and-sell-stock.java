class Solution {
    public int maxProfit(int[] prices) {

        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int currentDay = 1; currentDay < prices.length; currentDay++) {

            if (prices[currentDay] < minimumPrice) {
                minimumPrice = prices[currentDay];
            }

            int currentProfit = prices[currentDay] - minimumPrice;

            if (currentProfit > maximumProfit) {
                maximumProfit = currentProfit;
            }
        }

        return maximumProfit;
    }
}