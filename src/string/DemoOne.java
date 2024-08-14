package string;


public class DemoOne {
    public static void main(String[] args) {

        //2 Type of String in Java
        String str1 = "Manik";   //String literal
        String str2 = new String("Manik"); //String Object
        String str3 = new String("Manik"); //String Object

        String str4 = "Manik";

        //check address
        System.out.println(str1 == str2);       //false
        System.out.println(str2 == str4);       //false

        System.out.println(str1 == str4);       //true

        String str5 = "Man";

        String str6 = "nik";

        //This string will create on Heap area
        String str7 =  str5 + "ik";

        System.out.println(str7 == str1);           //false


        str1 = "RSharma";

        String str10 = "RSharma";
        System.out.println(str1 == str1);           //false
    }
}
