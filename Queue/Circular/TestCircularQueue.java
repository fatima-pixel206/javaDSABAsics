package If_Else.Queue.Circular;

import If_Else.Queue.Initialize;

// size -1
public class TestCircularQueue {
    static void main() {
        Initialize test = new Initialize();
        int size = 7;
        test.setSize(size);
        System.out.println(" end "+test.end +" start  "+test.start+" current size "+test.currents);
        // here start and end should be -1 and current size 0
        test.push(45);
        // now the current size is 1
        // end =0 and start =0
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(89);
        // now the current size is 2
        // end = 1  and start =0
       // System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
      //  System.out.println("front in queue "+test.first());// it will return 45
        test.pop();
        // now start should be 1
        // current size =1
//System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
      //  System.out.println("front in queue "+test.first());
        // it will return 89
            test.push(56);
// now the current size is 2
        // end = 2 and start =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(96);
// now the current size is 3
        // end = 3 and start =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(6);
// now the current size is 4
        // end = 4 and start =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(5);
// now the current size is 5
        // end = 5 and start =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(7);
// now the current size is 6
        // end = 6 and start =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
       // System.out.println("front in queue "+test.first());// it should print 89
      //  test.push(77);
// now the current size is 7
        // end = 0 and start =1
        // circular
      //  System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
      // System.out.println("front in queue "+test.first());
//
        test.pop();
        // start =2 end=6
        // current size =5
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.pop();
//        // start =3 end=6
//        // current size =4
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
       // System.out.println("front in queue "+test.first());
        // it prints 96
        test.pop();
        // start =4 end=6
        // current size =3
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);

         test.pop();
        // start =5 end=6
        // current size =2
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);

           test.pop();
        // start =6 end=6
        // current size =1
       System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
       // System.out.println("front in queue "+test.first());test.pop();
        test.pop();
        //
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        System.out.println("front in queue "+test.first());
        test.push(45);
        // s= 0
        // end =-1 current =-1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);
        test.push(45);
        // s= 1
        // end =0 current =1
        System.out.println("end "+test.end +" start  "+test.start+" current size "+test.currents);

    }
}
