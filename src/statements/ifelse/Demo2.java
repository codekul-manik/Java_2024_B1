package statements.ifelse;

public class Demo2 {
    public static void main(String[] args) {

        //nested if
        int age = 20;
        int income = 120;

        if(age == 21){
            if((income != 121) || (age >=20)){
                System.out.println("Age is eligible");
            }else{
                System.out.println("Income is low");
            }
        }else{
            if(age != 20){
                System.out.println("In-else");
            }else{
                System.out.println("In else");
            }
        }

    }
}
