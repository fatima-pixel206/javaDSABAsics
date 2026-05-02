package If_Else.Queue.Priority;

public class TestClass {
    static void main() {
        Implementation ch = new Implementation(8);
        ch.enqueue(56,7);
        ch.enqueue(6,8);
        ch.enqueue(90,2);
        ch.enqueue(5,13);
        ch.enqueue(43,5);
        ch.enqueue(12,4);
        System.out.println(ch.peak());
            //ch.display();
            ch.dequeue();
        ch.display();




    }
}
