public class MaxProfit {
    public static int findMaxProfit(int[] Prices){
        int minPrice =  Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : Prices){
            if (price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + findMaxProfit(prices));
    }
}
