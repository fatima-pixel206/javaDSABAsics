package If_Else.Queue.Circular;

public class CirculerQueuePreTest {
    static void main() {
        CirculerQueuePre t = new CirculerQueuePre(7);
        t.enqueue(5);// f,r=0
        t.enqueue(7);//f,=0,r=1
        t.enqueue(6);
//        t.dequeue();
        t.dequeue();
        t.dequeue();
        t.display();
        System.out.println();
        t.reverse();
        t.display();
      //  t.clear();
    }
}
