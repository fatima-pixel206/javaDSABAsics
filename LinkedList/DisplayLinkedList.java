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
        Scanner sc = new Scanner(System.in);
        Nod x = new Nod(sc.nextInt());
        Nod y = new Nod(3);
        Nod z = new Nod(90);
        Nod xx = new Nod(sc.nextInt());


        x.next=y;
        y.next=z;
        z.next=xx;

        DisplayLinkedList disv = new DisplayLinkedList();
        disv.Display(x);


    }
    public void Display(Nod head){
        for (Nod temp = head; temp != null ; temp=temp.next) {
            System.out.print(temp.val+" ");
        }
        // temp=temp.next
        // it means next of head and continue until null
    }

}
