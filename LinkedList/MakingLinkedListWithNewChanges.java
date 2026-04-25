package If_Else.LinkedList;
class MyNode{
  private   int age;
   private String name;
    MyNode next;
    public MyNode(int age , String name) {
        this.age = age;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// end of node
// make a data structure

        class MyLinkedList {
            private MyNode head;
            private MyNode tail;
            private int size;


            public MyNode getHead() {
                return head;
            }

//            public void setHead(MyNode head) {
//                this.head = head;
//            }

            public MyNode getTail() {
                return this.tail;
            }

//            public void setTail(MyNode tail) {
//                this.tail = tail;
//            }

            public int getSize() {
                return size;
            }

            // add from head
            void addFromHead(int age, String name) {
                MyNode temphead = new MyNode(age, name);
                if (head == null) {
                    this.head=temphead;
                    this.tail=head;
                }
                else {

                    temphead.next = head;
                    this.head = temphead;
                }
            size++;
            }
            void addFromTail(int age,String name){
                if(tail== null){
                    addFromHead(age,name);
                    return;
                }
                else {
                    MyNode tempTail = new MyNode(age,name);
                    this.tail.next= tempTail;
                    this.tail= tempTail;
                }
                this.size++;
            }
            // display
            void displayLink(){
                MyNode tem = head;
                while (tem != null) {
                    System.out.print(tem.getAge()+"  "+ tem.getName()+" , ");
                    tem= tem.next;
                }
                System.out.println();
            }
            // delete from head
            void deleteFromHead() {
                if (head == null) {
                    System.out.println(" linked list is empty >>");
                    return;
                }
                  head = head.next;
                    if (head == null)
                        tail = null;

                    size--;

            }
        }
public class MakingLinkedListWithNewChanges {
    static void main() {
        MyLinkedList my = new MyLinkedList();
        System.out.println( my.getHead());
        my.addFromTail(3,"Al");
        my.addFromHead(2," fatima");

//        System.out.println(my.getSize());
//        System.out.println(my.getTail());
//        System.out.println( my.getHead());
        my.addFromTail(3,"Alina");
        my.addFromTail(6,"Aliya");

        my.addFromTail(30,"Alishba");
        my.addFromTail(43,"Aleef");
        my.addFromTail(13,"Aleem");
        my.displayLink();
        my.addFromHead(10,"shan");
        my.displayLink();
        my.addFromTail(9,"hi");
        my.addFromHead(1,"gem");
        System.out.println(my.getSize());
       my.deleteFromHead();
        my.displayLink();
        System.out.println(my.getSize());

    }

}
