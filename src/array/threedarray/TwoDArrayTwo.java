package array.threedarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDArrayTwo {

    public static void printArray(int[][][] arr, int plane , int rows, int cols){
        System.out.println("Print 3D array");

        for (int i = 0; i < plane; i++) {
            System.out.println("plane : "+ i);
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void getData(int[][][] nike, int plane , int rows, int cols, BufferedReader br) throws IOException{
        System.out.println("Data from user !");

        for (int i = 0; i < plane; i++) {
            System.out.println("plane : "+ i);
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    nike[i][j][k] = Integer.parseInt(br.readLine());
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("3D Array");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter plane");
        int plane = Integer.parseInt(br.readLine());

        System.out.println("Enter rows");
        int rows = Integer.parseInt(br.readLine());

        System.out.println("Enter cols");
        int cols = Integer.parseInt(br.readLine());

        int[][][] arr = new int[plane][rows][cols];
        //call print method
        printArray(arr, plane, rows, cols);

        //get data from user
        getData(arr, plane, rows, cols, br);


        //
        printArray(arr, plane, rows, cols);

        //











        //test
        /*Q1:
        //Sorted Array
        ip: sort array : {10,21,22,23,34,54,18}
        op : {10,18,21,22,23,34,54}

        //remove Duplicate
        Q2: {10,20,-1,32,34,32,100,34,-1,-1, 0, 0, -1}
        ip: {10,20,32,34,100,0}

        //
        Q3 :You are given an array prices where prices[i] is the price of a
        given stock on the ith day.You want to maximize your profit by choosing a single day to buy
        one stock and choosing a different day in the future
        to sell that stock.Return the maximum profit you can achieve from this
        transaction. If you cannot achieve any profit, return 0.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed
        because you must buy before you sell.


        Example 2:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.

        *
        * */



    }
}
