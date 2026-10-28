class Solution {
    public int maxProfit(int[] p) {
         int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : p) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}