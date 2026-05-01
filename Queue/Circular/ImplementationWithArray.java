package If_Else.Queue.Circular;

public class ImplementationWithArray {
    private int cap;
    private  int size;
     int rear;
     int front;
    int [] queue ;
    public ImplementationWithArray(int cap){
        this.cap = cap;
        this.queue = new int[cap];
        this.front = -1;
        this.rear = -1;
        this.size =0;
    }
    // isEmpty
    boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;

    }
    // is full
    boolean isFull(){
        if(size == cap)
            return true;
        else
            return false;

    }
    // get size
    int getSize(){
        return this.size;
    }
    // get capacity
    int getCapacity(){
        return this.cap;
    }
        // enqueue
    void enqueue(int data){
        if(isFull())
        {
            System.out.println(" Queue is full ...........");
            return;
        }
        // move circulerly
        if(size == 0){
            front =0;
            rear =0;
        }
        else {
            rear =(rear+1)%cap;
        }
        queue[rear] = data;
        size++;
    }
    // dequeue
    int dequeu(){
        if(isEmpty()){
            System.out.println(" queue is empty \n ERROR.................");
            return -1;
        }
        int save = 0;
         if(size == 1){
             save = queue[front];
            rear = -1;
            front = -1;
            size--;
            return save;
        }
         else {
             save = queue[front];
             front = (front+1)%cap;
             // = queue[front];

             // move front circularly
         }
        size--;
         return save;
    }
        // PEAK
    int peak(){
        if(isEmpty())return -1;
        return queue[front];
    }
    // clear
    void clear(){
        if(isEmpty()){
            System.out.println(" already empty" );
            return;
        }
        rear =-1;
        front =-1;
        size =0;
    }
    // display
    void display()
    {
        int temp = front;
        for (int i = 0; i < size ; i++) {
            System.out.print(queue[temp]+" ");
            temp = (temp+1)%cap;
        }
    }

}
