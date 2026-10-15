class Solution {
    public int maxProfit(int[] prices) {
        int currentMax = 0;

        int today;
        for (int i = 0; i < prices.length-1;i++){
            today = prices[i];
            for (int j = i; j < prices.length;j++){
                if(prices[j] - today > currentMax){
                    currentMax = prices[j] - today;
                }
            }
        }
        return currentMax;
    }
}
