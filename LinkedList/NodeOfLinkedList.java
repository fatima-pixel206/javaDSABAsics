package If_Else.LinkedList;

public class NodeOfLinkedList {
    static void main(String[] args ) {
        Node a = new Node();

        a.value=45;

        Node b = new Node();
        b.value=67;
        Node c = new Node();
        c.value=89;
        Node d = new Node();
        d.value=76;
        Node e = new Node();
        e.value=76;
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         Node  tem= a;
//      while (tem!=null){
//          System.out.println(tem.value);
//          tem=tem.next;
//      }
        for (Node i = a; i != null ; i=i.next) {
            System.out.println(i.value);
        }
    }

}
 class Node{
    int value;
    Node next;// next node reference
}
