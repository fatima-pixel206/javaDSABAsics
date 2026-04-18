package If_Else.Stack.Learning;
/*

use an extra stack to maintain order
 */
public class StackUsingQueue {
    // making queue using array
    private int size;
    int start = -1;
    int end = -1;
    int cs = 0;
    int[] queue;

    public int getSize() {
        return cs;
    }

    public void setSize(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    // checking is empty
    public boolean isEmpty() {
        if (cs == 0) {
            return true;
        } else
            return false;
    }

    // check is queue is full
    public boolean isFull() {
        if (cs == size) {
            return true;
        } else
            return false;
    }

    // making push
    public void push(int n) {
        // check
        if (isFull()) {
            System.out.println(" queue is full");
            return;
        }
        if(isEmpty()){
            end= 0;
            start=0;
        }
       else  {
  end=(end+1)%size;
        }
       queue[end]=n;
        cs++;
    }

    // pop method
    public void pop() {
        //check
        if (isEmpty())
            System.out.println(" queue is empty ");

        else if (cs == 1) {
            end = -1;
            start = -1;
        }  else   {
            start = (start + 1) % size;

        }
        cs--;
    }
    // peak
    public int first(){
        if(isEmpty()){
            System.out.println(" queue is null");
            return -1;
        }
        else return queue[start];
    }
    public static void main(String[] a){
        // first push values in stack
        StackUsingQueue sq= new StackUsingQueue();
        int size=5;
        sq.setSize(size);

      //  System.out.println(sq.getSize());
        /*now the queue is
        //10,20,30,40,50
        lets make a temp stack
*/
        // push in queue
        for (int i = 0; i <size ; i++) {

            sq.push(i);
          //  System.out.print(sq.first()+" ");
//            sq.pop();

        }
        // check queue
//        for (int i = 0; i < size ; i++) {
//            System.out.print(sq.first()+" ");
//            sq.pop();
//        }
      //  System.out.println(" current size of qu "+sq.getSize());

        // making temp stack
        StackWithQueue temp = new StackWithQueue();
        temp.setSize(size);
        // push values
        for (int i = 0; i < size; i++) {
            temp.push(sq.first());
            sq.pop();

        }
//        System.out.println(temp.Top());
//        temp.pop();
//        System.out.println(temp.Top());
//        temp.pop();
//        System.out.println(temp.Top());
//        temp.pop();
//        System.out.println(temp.Top());
//        temp.pop();
//        System.out.println(temp.Top());
//        temp.pop();
        //
        //System.out.println(temp.Top());

    // so in stack the queue value are opposite

        //
        StackWithQueue finalStack= new StackWithQueue();
        finalStack.setSize(size);
        for (int i = 0; i < size ; i++) {
            finalStack.push(temp.Top());
            temp.pop();
        }
        System.out.println(" current size of Temp stack "+ temp.getSize());
        System.out.println(" current size of final stack "+ finalStack.getSize());
        for (int i = 0; i < size; i++) {
            System.out.print(finalStack.Top()+" ");
            finalStack.pop();
        }

    }
    }
