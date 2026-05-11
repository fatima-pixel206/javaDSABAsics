package If_Else.Queue.Circular;

public class CirculerQueuePre {
    private int front;
    private int rear;
    private int cap;
    private int size;
    private int[] ar;
    public CirculerQueuePre(int cap) {
        this.cap = cap;
        this.front = -1;
        this.rear = -1;
        this.size = 0;
        this.ar = new int[cap];
    }
    // full
    boolean isFull(){
        if(size == cap)return true;
        return false;
    }
    // empty
    boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    int getSize(){
        return this.size;
    }
    int getCap(){
        return this.cap;
    }
    // peak on front
    int peak(){
        if(isEmpty() ){
            System.out.println(" queue is empty ");
            return front;
        }
        else return ar[front];
    }
    // enqueue .. add from rear
    void enqueue(int data){
        if(isFull()){
            System.out.println(" no space");
            return;
        }
        else if (isEmpty()) {
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear+1)%cap;
        }
        ar[rear] = data;
        size++;
    }
    // dequeue delete from front
    int dequeue(){
        if(isEmpty()){
            System.out.println(" queue is empty......");
            return -1;
        }
        int store = ar[front];
     if(size==1){

            rear = -1;
            front = -1;
        }
        else {
            front = (front+1)%cap;
        }
        size--;
        return store;
    }
    //
    void clear(){
        front =-1;
        rear = -1;
        size =0;
    }
    // display() fifo
    void display(){
        if(isEmpty()){
            System.out.println(" null..");
            return;
        }
        for (int i = front; i <= rear ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    /* reverse*/
    void reverse() {
        if (isEmpty()) {
            System.out.println(" empty.");
            return;

        } else if (size == 1) {
            System.out.println("only one element");
            return;
        } else {
            int i = front;
            int j = rear;
            while (i < j) {
                int rev = ar[i];
                ar[i] = ar[j];
                ar[j] = rev;
                i++;
                j--;
            }
        }
    }
    int getFront(){
        return this.front;
    }
    int getRear(){
        return this.rear;
    }
}
