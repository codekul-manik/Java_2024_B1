package Variable;

public class Variables {

    //instance variable
    int a = 10;

    //static
    static int b = 20;


    public static void main(String[] args) {
        //local variable
        Variables obj = new Variables();
        System.out.println(obj.b);

        System.out.println(b);

    }

}
