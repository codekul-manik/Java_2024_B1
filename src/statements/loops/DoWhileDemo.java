package statements.loops;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to travelling guide : ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        char yesNo;
        do{
            System.out.println("Our famous vacations points");
            System.out.println("1 : Italy");
            System.out.println("2 : Kerala");
            System.out.println("3 : Paris");
            System.out.println("4 : Vrindavan");
            System.out.println("5 : New Jursey");

            System.out.println("Please select one of them : ");
            int getNum = Integer.parseInt(br.readLine());

            switch (getNum){
                case 1 :{
                    System.out.println("Thank you for selecting your vacation point as Italy");
                    System.out.println("Please enter days between 1 to 3");
                    int days = Integer.parseInt(br.readLine());

                    switch (days){
                        case 1 :
                            System.out.println("for one days 30k");
                            break;
                        case 2 :
                            System.out.println("for two days 70k");
                            break;

                        case 3 :
                            System.out.println("for three days 1.25 lakhs");
                            break;
                    }
                };
                break;

                case 2 :{
                  //code for case two
                };
                break;
            }
            System.out.println("Do you want to continue Y ? N");
            yesNo = (char) br.read();
        }while (yesNo == 'Y' || yesNo == 'y');
    }
}
