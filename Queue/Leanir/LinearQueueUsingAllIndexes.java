package If_Else.Queue.Leanir;

public class LinearQueueUsingAllIndexes {
     private int size;
    int current;
   int[] Queue;

   int rear=-1 ;
   int front = -1;

    public int getSize() {
        return current;
    }

    public void setSize(int size) {
        this.size = size;
        Queue = new int[size];

    }
    // is full
    public boolean isFull(){
        if(current==size)
        {
            return true;
        }
        else return false;
    }
    // is empty
    public boolean isEmpty(){
        if(current==0){
            return true;
        }
        else
            return false;
    }
    // Enqueue
    public void Enqueue(int data){
        if(isFull()){
            System.out.println("queue is full ");
            return;
        }
        else if (isEmpty()) {
          front=0;
          rear =0;
          Queue[rear]= data;

        }
        else if (current < size && rear == size-1) {
            rear=0;
//Queue[rear] = data;


        }

        else {
            rear++;
        }
        Queue[rear]= data;
        current++;
    }
    // deque
    public int dequeue(){


        if(isEmpty()){
            System.out.println(" queue is empty ");
            return -1;
        }
        int temp= Queue[front];

         if (current < size && front== size-1) {

            front=0;

        }
        else {

            front++;
        }
        current--;
        return temp;
    }
      public int frontValue(){
        if(isEmpty())
            return -1;

        return Queue[front];
      }

}
