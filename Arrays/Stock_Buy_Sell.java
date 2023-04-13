package Arrays;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,12};
        System.out.println(MaxProfit(arr));

    }
    static int MaxProfit(int[] arr){
        int l = arr.length;
        int profit = 0;
        for (int i = 1; i < l; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];

            }
        }
        return profit;
    }
}
