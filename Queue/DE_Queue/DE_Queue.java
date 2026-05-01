package If_Else.Queue.DE_Queue;

public class DE_Queue {
    int cap =8;
    int front =-1;
    int rear =-1;
    int size =   0;
    int [] deque = new int[cap];

    // insert from front
    void insertfront(int value){
        if(size== cap)return;
        if(front ==-1){
            front =0;
            rear =0;
        }
        else {
            front = (front-1  + cap)% cap;

        }


        deque[front] = value;
        size++;
    }
    /// dele from rear
    int deleteFromrear(){
        if(size == 0){
            System.out.println(" quue is empyt");
            return -1;
        }
        int tem = deque[rear];
         if( size==1){
            front = front-1;
            rear = 1;
        }

        else {
            rear =(rear-1+cap)%cap;

        }
        size--;
        return tem;
    }



}
