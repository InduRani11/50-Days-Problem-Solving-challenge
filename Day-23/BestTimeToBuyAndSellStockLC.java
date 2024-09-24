public class BestTimeToBuyAndSellStockLC {
    public static int maxProfit(int[] prices) {
        int arr[]=new int[prices.length];
        int max=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=max;
            max=Math.max(max,prices[i]);

        }
        int maxpr=0;
        int pr;
        for(int i=0;i<arr.length-1;i++){
            pr=arr[i]-prices[i];
            maxpr=Math.max(maxpr,pr);

        }
        return maxpr;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
