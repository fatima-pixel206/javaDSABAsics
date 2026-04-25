package If_Else.LinkedList;
      class  NodeC {
          // user define data type
          int value;
          NodeC next;
          NodeC(int value){
              this.value=value;
          }

        }
        /// user define data structure
        class Linkedlist {
            NodeC head; // default null
            NodeC tail;// default null
            int size;
            // we are making head and tail because we can add from front and back
//           public Linkedlist(){
//               head= tail= null;
//           }
            void addAtHead(int value){
                NodeC headF = new NodeC(value);
                if(head== null){
                    head= headF;
                    tail=headF;
                }
                else {
                    headF.next=head;// connecting with head
                    this.head=headF;// giving ref to head of new head

                }
                size++;
            }
            void addAtTail(int value) {
                // if list is null
                NodeC temp = new NodeC(value);
                if (head == null ) {

                    head = temp;
                    tail = temp;

                }
                else {
                    // chaining
                    tail.next = temp;
                    // updating tail
                    this.tail = temp;// tail ++
                }
                size++;
            }

            void displayList(){
                if(head==null) return;
                for (NodeC temp=this.head; temp != null; temp=temp.next) {
                    System.out.print(temp.value+",");
                }
                System.out.println();
            }

            void deleteAtHeead(){
                if(head== null) {
                    System.out.println(" empty linked list Eroooor");
                    return;
                }

                    head=head.next;
                if(head== null)
                    tail=null;
                size--;
            }
            boolean search(int val){
                NodeC my = head;
                boolean find=false;
                while(my!= null){
                    if(my.value== val)
                        find = true;
                        return find;
                }
                return find;
            }
            void deleteAtTail(){
                if(head== null){
                    return;
                }
                else {
                    this.tail=null;
                }
                size--;
            }

        }
public class LinkedListDataStructure {
    static void main() {


        Linkedlist ll = new Linkedlist();
        ll.displayList();
        //ll.deleteAtHeead();
        ll.addAtTail(30);// now this is head
        System.out.println(ll.head.value);
        System.out.println(ll.tail.value);
        ll.addAtTail(300);// this is tail
        System.out.println(ll.tail.value);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(360);
        ll.addAtTail(3009);
        ll.displayList();
        System.out.println(" size "+ll.size);
        ll.addAtHead(5000);
        System.out.println(ll.head.value);
        ll.displayList();
        ll.addAtHead(79);
        ll.displayList();
        System.out.println(" size "+ll.size);
        ll.deleteAtHeead();

        ll.displayList();
        System.out.println(" size "+ll.size);
        ll.addAtHead(808);
        ll.displayList();
        System.out.println(" size "+ll.size);
        // time complexity of insertion and deletion is O(1)
        // A S  is O(1)
        ll.deleteAtTail();
        ll.displayList();
        System.out.println(" size "+ll.size);
        ll.deleteAtHeead();
        ll.displayList();
        System.out.println(" size "+ll.size);
    }
}