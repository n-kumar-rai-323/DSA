public class Best_Time_to_Buy_Sell_Stock {
    public static int buyToSellStock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buyprice<price[i]){ //profit
                int profit = price[i]- buyprice; // today profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyprice = price[i];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buyToSellStock(price));
    }
    
}
