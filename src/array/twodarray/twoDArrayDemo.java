package array.twodarray;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twoDArrayDemo {
    public static void main(String[] args) throws IOException {

        //way 2:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter rows : ");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter cols : ");
        int cols = Integer.parseInt(br.readLine());

        //declared //memory : heap area
        int[][] arr = new int[row][cols];

        //access
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //values put
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the element for "+ i + "th row and "+ j + "th col :");
                int num = Integer.parseInt(br.readLine());
                arr[i][j] = num;
            }
            System.out.println();
        }

        //access
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
