package statements.loops;

public class DemoForT {
    public static void main(String[] args) {
        //nested for loop

        for(int i=0; i <= 4; i++){
            int m = 0;
            for(int j=0; j<= 3 ; j++){
                m = m + j;
                System.out.print(m);        //
            }
            System.out.println(m);          //new line
        }
    }
}
