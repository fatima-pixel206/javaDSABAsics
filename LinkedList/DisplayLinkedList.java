package If_Else.LinkedList;

import java.util.Scanner;


class Nod{
    int val;
     Nod next ;
     public Nod(int n){
         this.val=n;
     }

}

public class DisplayLinkedList {
    static void main(String[] args) {
        //   Scanner sc = new Scanner(System.in);
        Nod x = new Nod(67);
        Nod y = new Nod(3);
        Nod z = new Nod(90);
        Nod xx = new Nod(67);


        x.next = y;
        y.next = z;
        z.next = xx;

        DisplayLinkedList dis = new DisplayLinkedList();
        // disv.Display(x);
        //dis.displayRec(x);
        // Nod n= null;
       // dis.reverseDisplay(x);
//
        System.out.println(dis.search(x,607));
    }

    // display rec
    public void displayRec(Nod head) {
        if (head == null) return;
        IO.print(head.val + " ,");
        displayRec(head.next);


    }

    // reverse
    public void reverseDisplay(Nod head) {
        if (head == null) return;
        reverseDisplay(head.next);// it goes to last node and then start printing from last

        System.out.print(head.val + ",");
    }

    protected void Display(Nod head) {
        for (Nod temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " ");
        }
        // temp=temp.next
        // it means next of head and continue until null
    }

    // search in
    protected int search(Nod head, int a) {
        while (head != null) {
            if (head.val == a)
                return head.val;

            head=head.next;
        }
        return -1;
    }
}