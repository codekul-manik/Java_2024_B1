package string;

public class ProblemTwo {
    public static void main(String[] args) {

        // Pallindrome String
        String str = "nmnmnmn";


        int start = 0;
        int end = str.length() - 1;

        //nmnmnmn

        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                break;
            }
            start ++;
            end--;
        }

        if(start == end){
            System.out.println("This string is pallindrome");
        }else{
            System.out.println("This string is not pallindrome");
        }


        //Frequency of character
        String str2 = "you are the one !";
        int[] carr2 = new int[127];


        int startt = 0;
        while(startt < str2.length()){
            if(str2.charAt(startt) != ' '){
                carr2[str2.charAt(startt)] ++;
            }
            startt++;
        }

        for (int i = 0; i < carr2.length; i++) {
            if(carr2[i] != 0)
                System.out.println("frequency of char "+ (char)i + " is " + carr2[i]);
        }
    }
}
