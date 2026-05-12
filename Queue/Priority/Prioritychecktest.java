package If_Else.Queue.Priority;

public class Prioritychecktest {
    static void main() {
        PriorityCheck pr = new PriorityCheck(8);
        pr.enque(8,5);
        pr.enque(6,2);
        pr.enque(4,8);
        pr.display();
        pr.deque();
        System.out.println(pr.peak()+"  ");
        System.out.println(pr.size);
         pr.display();
    }
}
