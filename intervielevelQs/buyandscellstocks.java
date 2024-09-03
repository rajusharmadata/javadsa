public class buyandscellstocks {
    public static int buyandssellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i = 0; i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]-buyPrice;
                maxprofit = Math.max(maxprofit, profit);

            }else{
                buyPrice = prices[i];// this is a price
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {6,1,3,5,6,7};
      System.out.println( buyandssellstocks(prices)); 
        
    }
}