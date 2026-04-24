package If_Else.LinkedList;

public class CheckReference {
    static void main() {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(21);
        Node d = new Node(13);
        Node f = new Node(3);
        Node g = new Node(5);
        Node h = new Node(24);
        c.value = 90;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        a.next = b;
        b.next = c;
        System.out.println(a.next);// a have b reference all data or everything in b
        System.out.println(a.next.next);// this is c
        // so from one reference if they are connected we can cal all
        System.out.println(a.next.next.value);// it should be 90
        c.next = b;
        System.out.println(a.next.next.next.next);
        System.out.println(g);
        h.value=0;
        g=h;
        System.out.println(g.value);
        System.out.println(h);
    }
}
