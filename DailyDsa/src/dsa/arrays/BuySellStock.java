package dsa.arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitSolution2(prices));
    }
    public static int maxProfitSolution2(int[] prices){
        int minSoFar = Integer.MAX_VALUE;
        int profit =0;

        for (int price : prices) {
            if (price < minSoFar) {
                minSoFar = price;
            } else {
                int gain = price - minSoFar;
                if (gain > profit) profit = gain;
            }

        }
        return  profit;

    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i =0 ; i<prices.length ; i++){
            for(int j=i+1 ; j<prices.length ; j++){
                int priceDiff = prices[j] - prices[i];
                if(priceDiff > profit){
                    profit = priceDiff;
                }
            }
        }
        return profit;
    }
}
