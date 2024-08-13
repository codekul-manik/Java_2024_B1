package array.threedarray;

public class Problems {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printDuplicateArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                break;
            else
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void removeDuplicate(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] != -1){
                    if(arr[i] == arr[j]){
                        arr[j] = -1;
                    }
                }
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != -1){
                newArr[j] = arr[i];
                j++;
            }
        }

        printDuplicateArray(newArr);
    }

    public static void sortArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void buyAndSellStocks(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Not enough data to determine profit.");
            return;
        }

        int minPrice = arr[0];
        int maxProfit = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            // Check if current price offers a higher profit than previously found
            int currentProfit = arr[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                maxIndex = i;
            }

            // Update the minimum price and index if a new minimum is found
            if (arr[i] < minPrice) {
                minPrice = arr[i];
                minIndex = i;
            }
        }

        // Print the results
        if (maxProfit > 0) {
            System.out.println("Buy on day " + (minIndex + 1) + " at price " + arr[minIndex]);
            System.out.println("Sell on day " + (maxIndex + 1) + " at price " + arr[maxIndex]);
            System.out.println("Maximum profit: " + maxProfit);
        } else {
            System.out.println("No profit can be made.");
        }
    }



    public static void main(String[] args) {
        /*Q1:
        //Sorted Array
        ip: sort array : {10,21,22,23,34,54,18}
        op : {10,18,21,22,23,34,54}
        */

        int[] arr = {10,21,22,23,34,54,18};
        //call sort array method
        sortArray(arr);

        //remove Duplicate
        //Q2: {10,20,10,32,34,32,100,34,10,10, 0, 0, 10}
        //op: {10,20,32,34,100,0}

        int[] rmArr = {10,20,10,32,34,32,100,34,10,10, 0, 0, 10};
        removeDuplicate(rmArr);

        /*Q3 :You are given an array prices where prices[i] is the price of a
        given stock on the ith day.You want to maximize your profit by choosing a single day to buy
        one stock and choosing a different day in the future
        to sell that stock.Return the maximum profit you can achieve from this
        transaction. If you cannot achieve any profit, return 0.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed
        because you must buy before you sell.*/

        int[] prices = {7,1,5,3,6,4};
        buyAndSellStocks(prices);
    }
}
