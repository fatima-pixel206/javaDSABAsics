package If_Else.Stack.Learning;

import java.util.Stack;

public class PaperTest {
    PaperPrepStack test = new PaperPrepStack(6);
     void main() {
        PaperPrepStack test = new PaperPrepStack(6);
        test.push(8);
        test.push(7);
        test.push(6);
        test.push(5);
        test.push(4);
        test.push(2);
         System.out.println(test.peak());
       test.display();
         System.out.println();
       System.out.println(test.getSize());
         System.out.println(test.peak());
//        System.out.println();
      // test.reverse();
//         test.reversrec();


       //  test.copy();

        test.reverse();
         test.display();
         System.out.println(test.getSize());
         System.out.println(test.peak()+",");
         test.clear();
         test.pop();
//        test.pop();
//        test.display();
//        test.push(10);
//        test.display();

    }

    }

