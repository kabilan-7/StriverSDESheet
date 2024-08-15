package striversdesheet.arrays;

public class StockSell{
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            maxprofit=Math.max(arr[i]-min,maxprofit);
        }
        return maxprofit;
    }
}