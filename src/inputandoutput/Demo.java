package inputandoutput;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {

        //BufferedReader class
        //connection established
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //for String
        System.out.println("What's your good name ?: ");
        String name = br.readLine();        //readLine method return type : String // Here we take actual input
        System.out.println("Hello "+ name);

        //for character
        System.out.println("Enter character only :");
        char c = (char)br.read();       //read method return type : int // Here input and also do typecasting
        br.skip(1);                   //skip method for "\n"
        System.out.println("Your character is "+ c);


        //for data types
        System.out.println("Enter the Integer value :");
        int val = Integer.parseInt(br.readLine());          //do parsing for String into Integer
        System.out.println("The integer value is : "+ val);
    }
}
