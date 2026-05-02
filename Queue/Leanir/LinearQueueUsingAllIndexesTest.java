package If_Else.Queue.Leanir;

public class LinearQueueUsingAllIndexesTest {
    static void main() {
        LinearQueueUsingAllIndexes lq=  new LinearQueueUsingAllIndexes();
       lq.setSize(7);

         lq.Enqueue(8);
         // currents =1 end=0 start =0
        lq.Enqueue(90);
        // currents =2 end=1 start =0
        lq.Enqueue(12);
        // currents =3 end=2 start =0
        lq.Enqueue(88);
        // currents =4 end=3 start =0
        System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
        lq.Enqueue(2);
//        // currents =5 end=4 start =0
       lq.Enqueue(87);
//        // currents =6 end=5 start =0
       lq.Enqueue(5);
//        // currents = 7 end=6 start =0
        System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
//// lets pop
        lq.dequeue();
//        // current = 6 , front =1 , end = 6
        System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
        lq.dequeue();
//        // current = 5 , front =2 , end = 6
       System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
        lq.Enqueue(87653);
//        // current = 6 , front =2 , end = 0
        System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
//        lq.Enqueue(87653);
//        // current = 7 , front =2 , end = 1
//        System.out.println(" size = "+lq.getSize()+" front = "+lq.front+" end = "+lq.rear);
//        lq.Enqueue(90);
//        int s= lq.getSize();
//
//        for (int i = 0; i < s ; i++) {
//            System.out.print(lq.frontValue()+" , ");
//            lq.dequeue();
//        }
////
//        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();
////        System.out.println(lq.frontValue());
////        lq.dequeue();


    }


}
