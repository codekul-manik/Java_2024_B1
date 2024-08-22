package function;

import javax.swing.plaf.TableHeaderUI;

public class DemoTwo {

    //for StringBuffer and StringBuilder
    public static void main(String[] args) throws InterruptedException {

        StringBuilder stringBuffer = new StringBuilder();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
            }
        });

//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < 1000; i++) {
//                stringBuffer.append("B");
//            }
//        });

        t1.start();
    //    t2.start();

        t1.join();
     //   t2.join();

        System.out.println(stringBuffer.length());     //2000

    }
}
