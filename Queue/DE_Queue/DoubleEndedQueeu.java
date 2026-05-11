package If_Else.Queue.DE_Queue;

public class DoubleEndedQueeu {
    int size;
    int cap;
    int front;
    int rear;
    int[] qu;
    public DoubleEndedQueeu(int cap){
        this.cap = cap;
        this.front = -1;
        this.rear =-1;
        this.qu = new int[cap];
    }
    // full
    boolean isFull(){
        if(size == cap) return true;
        else return false;
    }

    public int getSize() {
        return size;
    }

    // null
    boolean isEmpty(){
        if(size== 0)return true;
        else return false;
    }

    // add from rear like circuler
    void addAtRear(int data){
        if(isFull())
        {
            System.out.println(" ful...");
            return;
        } else if (front==-1) {
            front =0;
            rear = 0;
        }
        else {
            rear = (rear+1)%cap;
        }
        qu[rear]=data;
        size++;
    }
    // add at front
    void addAtFront(int f){
        if(isFull()){
            System.out.println(" fulll");
            return;
        } else if (isEmpty()) {
            rear =0;
            front =0;
        }
        // shift
        else if(front == 0){
            for (int i = rear; i >= front ; i--) {
                qu[i] = qu[i+1];
            }

        }
        else {
            front = (front-1+cap)%cap;
        }
        qu[front]= f;
        rear++;
        size++;
    }
    // delete at front
    int deleteAtfront(){
        if(isEmpty()){
            System.out.println(" empty ..");
            return -1;
        }
        int save = qu[front];
         if (size ==1) {
            rear =-1;
            front=-1;

        }
         else {
             rear = (rear+1)%cap;
         }
         size--;
         return save;
    }
    // delete from rear
    int deleteAtRear(){
        if(isEmpty()){
            System.out.println(" empty"); return -1 ;

        }
        int save = qu[rear];
        if(size ==1){
            rear =-1;
            front =-1;

        }
        else {
            rear =(rear-1+cap)%cap;
        }
        size--;
        return save;
    }
    // display from front
    void displayFromFront(){
        if(isEmpty()){
            System.out.println(" nul///");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(qu[i]+" ");
        }
    }
    // display from rear
    void displayFromRear(){
        if(isEmpty()){
            System.out.println(" nul.......");
            return;
        }
        for (int i = rear; i >=front ; i--) {
            System.out.println(qu[i]);
        }
    }
    // clear
    void clear(){
        front =-1;
        rear =-1;
        size=0;
    }

}
