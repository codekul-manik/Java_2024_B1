package string;

import java.util.Arrays;

public class DemoFour {

    public static void main(String[] args) {

        String str = "Man";

        //length()
        System.out.println("Length of String is : " + str.length());

        //concat()
        str = str.concat("ik");
        System.out.println("String updated : " + str);

        char[] c = {'M', 'a', 'n', 'i', 'k'};
        String newStr = Arrays.toString(c);
        System.out.println(newStr);

        //convert into character array
        String str5 = "Manik";
        char[] str6 = str5.toCharArray();
        System.out.println(Arrays.toString(str6));
    }
}
