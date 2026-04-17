package If_Else.Queue;
/*
queue is nothing but an array with different rules
the rules are opposite to stack
 */
public class Initialize {
     public int size;
      int [] queue;
      int start=-1;
    int end=-1;
    int currents=0;

    public int getSize() {
        return this.currents;
    }

    public void setSize(int size) {
        this.size = size;
        this.queue= new int[size];
    }
    // check is empty or not
    public boolean isEmpty(){
        if(start==-1){
            return true;
        }
        else
            return false;
    }
    // check if full
    public boolean isFull(){
        if(currents==size)
            return true;
        else
            return false;
    }
    //push
    public void push(int n){
        if(isFull()){
            System.out.println(" queue is full");
            return;
        }
        else if(start==-1){
            this.start++;
            queue[start]=n;
            this.currents++;
        }
        else{

           this.end= currents;
            if(end>0)
            queue[end]=n;
            this.currents++;
        }
    }
    // pop
            public void pop(){
        if(currents==0 ){
            System.out.println(" queue is null");
        }
        else{
           start++;
           this.currents--;
        }
    }
    // access first element
    public int first(){
        if(currents==0) {

            System.out.println(" queue is null");
            return -1;
        }
        else
        return queue[start];

    }

    static void main() {
        int size=7;

        Initialize q= new Initialize();
        q.setSize(size);
        q.push(891);
        q.push(819);

        q.push(489);
        q.push(589);
        q.push(5809);
        q.push(389);
        q.push(956);

        q.push(900);
        System.out.println(q.currents);//7
        System.out.println(q.first());// 891
        q.pop();// 891

        System.out.println(q.currents);//6
        System.out.println(q.first());//819
        q.pop();// 819

        System.out.println(q.currents);//5
        System.out.println(q.first());//489
        q.pop();// 489

        System.out.println(q.currents);//4
        System.out.println(q.first());//589
        q.pop();//589 s 3
        System.out.println(q.currents);
        q.pop();//5809 s 2
        System.out.println(q.currents);
        q.pop();//389 s=1
        System.out.println(q.currents);// 1
        System.out.println(q.first());//956
        q.pop();//956 s= 0
        System.out.println(q.currents);
        System.out.println(q.first());
        q.pop();


    }
}


