package statements.switchcase;

public class SwitchDemo {
    public static void main(String[] args) {

        int age = 21;
        switch (age){
            case 21 : {
                System.out.println("Age is 21");

                //swap two var without using third var
                int a = 10;
                int b = 20;

                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println(a);
                System.out.println(b);
            };
            break;

            case 22 :
                System.out.println("Age is 22");
                break;

            case 23 :
                System.out.println("Age is 23");
                break;

            default:
                System.out.println("Age is not valid");
                break;

        }
    }
}
