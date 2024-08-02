package statements.loops;

public class Problems {
    public static void main(String[] args) {

        System.out.println("Prime Number : forcefully");        // time complexity : O(n^2)
        for(int i=2;i<=100;i++){
            int count=0;
            for(int j=2;j<=100;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nPrime number : Optimized : Using One For Loop");  // time complexity : O(n)
        for(int i=2; i<100; i++){
            if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)){
                System.out.print(i + " ");
            }if(i <= 9){
                if(i == 2 || i == 3 || i==5 || i ==7){
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\nPattern 2nd \n");
            for (int i = 1; i <= 4; i++) {
                int count = 0;
                for (int j = 1; j <= 4; j++) {
                    count++;
                    if (count <= 2) {
                        System.out.print(count);
                    } else {
                        System.out.print("1");
                        count = 1;
                    }
                }
                System.out.println();
            }

        System.out.println("\nPattern 3rd");
// 1 2 3 4
// a b c d
// 1 2 3 4
// a b c d

        for(int i=1; i<=4; i++){
            int m = 1;
            char n = 'a';
            for(int j=1; j<=4; j++){
                if(i % 2 != 0){
                    System.out.print(m+ " ");
                    m++;
                }else{
                    System.out.print(n+ " ");
                    n++;
                }
            }
            System.out.println();
        }

        System.out.println("\n Pattern 4th\n");
                char mainCh = 'A';
                int mainNum = 1;

                for (int i = 1; i <= 5; i++) {
                    char ch = mainCh;
                    int num = mainNum;
                    for (int j = 1; j <= 5; j++) {
                        if(j % 2 == 0){
                            System.out.print(num + 5 + " ");
                            num = num + (5*j);
                            ch += 5;

                        }else{
                            if(i == 1) {
                                System.out.print(ch + " ");
                                ch += 5;
                            }else {
                                System.out.print(ch+ " ");
                                ch += 5;
                            }
                        }
                    }
                    mainCh++;
                    mainNum++;
                    System.out.println();
                }

        System.out.println("\n Pattern 5th");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n Prime numbers \n");

        for(int i = 2; i<=120; i++){
            if(((i %2 != 0) && (i %3 != 0) && (i %5 != 0) && (i %7 != 0))) {
                System.out.print(i + " ");
            }
        }
    }
    }
