package array.threedarray;

public class ThreeDArrayDemo {
    public static void main(String[] args) {

        //3D array
        int plane = 2;
        int row = 2;
        int col = 3;

        int[][][] arr = new int[plane][row][col];

        //access
        for (int m = 0; m < plane; m++) {
            for (int n=0; n<row; n++){
                for (int o=0; o<col; o++){
                    System.out.print(arr[m][n][o]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
