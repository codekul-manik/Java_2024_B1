package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticFunTwo {

    static int[] seats = new int[40];

    public static void bookBusTickets(String vehicleNo, int seatNo){
        seats[seatNo] =+1 ;
        System.out.println("Your seat has been booked !");
    }

    public static boolean checkSeatAvailable(int seat){
        if(seats[seat] == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Booking system ");
        System.out.println("Enter Vehicle No");
        String vehicleNo = br.readLine();

        System.out.println("Available seats");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] + " ");
        }
        System.out.println();

        System.out.println("Please choose your comfort seat");
        int seat = Integer.parseInt(br.readLine());

        //call function
        boolean ans = StaticFunTwo.checkSeatAvailable(seat);
        if(ans) {
            System.out.println("This seat is already book by someone");
        }else{
                System.out.println("Proceed ahead !");
                //call function
            StaticFunTwo.bookBusTickets(vehicleNo, seat);
        }
    }
}
