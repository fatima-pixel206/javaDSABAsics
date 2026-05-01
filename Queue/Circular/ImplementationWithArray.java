package If_Else.Queue.Circular;

public class ImplementationWithArray {
    private int cap;
    private  int size;
    private int rear;
    private int front;
    int [] queue ;
    public ImplementationWithArray(int cap){
        this.cap = cap;
        this.queue = new int[cap];
        this.front = -1;
        this.rear = -1;
        this.size =0;
    }
    //

}
