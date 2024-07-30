package operators;

public class Demo {
    public static void main(String[] args) {

        //assignment operator
         int a = 10;

         // Arithmetic Operator

        int b = 10 + 10;
        System.out.println(a);      //20

        int c = b - (-100);
        System.out.println(c);      //120

        float d = 20.0f * 10;
        System.out.println(d);      //200.0

        int e = 20 / 2;
        System.out.println(e/5);

        int f = (e + 'A') % 2;
        System.out.println(f);

        //unary operator
        //Pre increment(++a) // Post increment(a++)
        //pre decrement(--a) // Post decrement(a--)

        //Post Increment
//        int z = 10;
//        int m = 11;
//
//        z = z++;
//
//        System.out.println(z);
//
//        z = z++;
//
//        System.out.println(z++);

        //Pre increment

//        int t = 10;
//        System.out.println(t);
//        System.out.println(++t);
//
//        int m = 10;
//        int n = 99;
//        int ans = n++ + ++n + m++ + ++m;
//        System.out.println(ans);
//
//        System.out.println(m--);

        int s = 10;
        int l = 10;

        System.out.println(--s);
        System.out.println(--l);

        int m = 98;
        int n = 99;

        int ans = n++ + --n + m++ + n++ + --m + --n + n-- + ++n;
        System.out.println(ans);


        //Relational Operator
        // == (equal equal)
        int x = 10;
        int y = x++ + --x;


        // != (not equals)
        // 10 != 10     false statement : 10 != 11 : true
        System.out.println(x != y);         //true
        System.out.println(x == y);            //false
        System.out.println(x);          //10
        System.out.println(y);            //20

        //! (not operator)

        boolean val = true;
        System.out.println(val);
        System.out.println(!val);

        // < (less than)
        // > (greater than)

        int j = 10;
        int jm = 11;

        System.out.println(j < 10);     //false
        System.out.println(j < 9);  //false
        System.out.println(j > 10);     //false
        System.out.println(j < jm+10);      // true

        // <= less than equals to
        // >= greater than equals to

        System.out.println(10 <= 10);        // true
        System.out.println(10 <= 9);         // false
        System.out.println(10 >= 11);         // false
        System.out.println(10 >= 10);       //true


        //logical Operators
        // && (logical And Operator) // || (logical OR Operator)
        // logical and operator
        // T | T | = T

        int ok = 23;
        int ko = 24;

        System.out.println((ok == (ko-1) && (ko <= 24)));
        //23 == 23  //true
        //24 <= 24  //true

        //Logical OR operator (||)
        System.out.println((ok == 22) || (ok != 22));
        // 23 == 22 //false             // T | T | = T
        // 23 != 22 //true              // T | F | = T
                                        // F | F | = F
                                        // F | T | = T

        //BitWise Operator
        //Next & , | , ^ , Bit 10 = 1010
        }
}
