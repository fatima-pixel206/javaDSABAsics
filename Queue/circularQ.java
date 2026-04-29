package If_Else.Queue;

public class circularQ {
    int cap = 8;
    int front = -1;
    int rear = -1;
    int[] queue = new int[cap];
    int size =0;

    void enqueue(int value){
        if(size == cap){
            System.out.println(" queue is full");
            return;
        }
        else if(rear == -1 && front == -1){
            rear =0;
            front =0;

        }
        else {
            rear = (rear+1) % cap;


        }
        queue[rear] = value;
        size++;
    }
    // dequeue
    int deque(){
        int temp =0;
        if(size == 0){
            System.out.println(" queue is empty");
            return -1;
        }
        else{
            temp = queue[front];
            front = (front+1)% cap;
            size--;
        }



        return temp;
    }

}
