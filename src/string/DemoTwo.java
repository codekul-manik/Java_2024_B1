package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoTwo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String is not initialised that why this string will go on heap area
        String str;
        System.out.println("Enter your name ?");
        str = br.readLine();

        String str2;
        str2 = br.readLine();

        System.out.println("str1 : "+ str);
        System.out.println("str2 : "+ str);
        System.out.println(str == str2);            //false

        String str3 = new String(str);
        System.out.println("Your name is : "+ str2);
    }
}
