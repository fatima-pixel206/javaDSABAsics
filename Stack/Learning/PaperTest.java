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

       test.display();
//        System.out.println();
       test.reverse();
        System.out.println();
        //revRecursive(test);
       //  test.copy();
        test.display();
        test.pop();
        test.display();
        test.push(10);
        test.display();

    }
    public void revRecursive(PaperPrepStack test){
    if(test.isEmpty()) return;

        int temp = test.pop();
        revRecursive(test);
      test.push(temp);

    }
}
