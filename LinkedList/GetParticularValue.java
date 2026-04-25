package If_Else.LinkedList;
//O(n)
public class GetParticularValue {
    static void main() {


        Node head = new Node(8);
        Node b = new Node(84);
        Node c = new Node(8);
        Node d = new Node(8);
        Node f = new Node(8);
        Node g = new Node(8);
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        f.next=g;
        GetParticularValue get = new  GetParticularValue();
        System.out.println(get.getParti(head,4));
        // we are suppousing list is start from 0 index
    }
    public int getParti(Node head, int index ){
        int i=0;
//        for (Node temp = head; temp!= null ; temp=temp.next) {
//            if(i==index)
//            {
//                return temp.value;
//            }
//
//            i++;
//        }
        for (Node temp= head; i<=index ; temp=temp.next) {
            i++;
        }

        return head.value;
    }

}
