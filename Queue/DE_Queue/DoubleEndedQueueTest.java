package If_Else.Queue.DE_Queue;

public class DoubleEndedQueueTest {
    static void main() {
        DoubleEndedQueeu db = new DoubleEndedQueeu(7);

       db.displayFromFront();
        db.addAtFront(8);
        db.addAtRear(9);
        //db.displayFromFront();
        db.addAtFront(7);
        db.displayFromFront();
        System.out.println();
        db.displayFromRear();
        db.deleteAtfront();
        System.out.println();
        db.displayFromFront();
        db.deleteAtRear();
        System.out.println(db.peakofFront());
        db.deleteAtRear();
        System.out.println(db.getSize());
        db.addAtRear(8);
        db.addAtFront(6);
        db.displayFromRear();
//       DeQueue dq = new DeQueue(7);
//       dq.insertFront(6);
//       dq.insertRear(8);
//       dq.insertFront(7);
//       dq.deleteRear();
//       dq.deleteFront();
//       dq.display();
    }
}
