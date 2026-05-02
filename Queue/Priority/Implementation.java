package If_Else.Queue.Priority;

public class Implementation {
    int cap;
    int size;
    int[] values;
    int [] priority;
    public Implementation(int cap){
        this.cap = cap;
        this.priority= new int[cap];
        this.values = new int[cap];
        size =0;
    }
    // size
    int getSize()
    {
        return this.size;
    }
    // clear
    void clear(){
        size =0;
    }
    // get cap
    int getCap(){
        return this.cap;
    }
    // isEmpty
    boolean isEmpty(){
        if(size== 0)
            return true;
        else return false;

    }
    // is full
    boolean isFull(){
        if(size == cap)
            return true;
        else return false;
    }
    // enqueue
    void enqueue(int item,int prio){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        values[size]= item;
        priority[size] = prio;
        size++;

    }
    // dequeue unsorted
    int dequeue(){
        if(isEmpty()){
            System.out.println(" queue is empty ");
            return -1;
        }
        if(size == 1)return values[size--];
        // find high priority
        int hp = 0;
        for (int i = 0; i < size ; i++) {
            if(priority[i] > priority[hp])
                hp = i;
        }
        // save dta
        int save = values[hp];
        // shift
        for (int i = hp; i < size -1 ; i++) {

            values[i] = values[i+1];
            priority[i] = priority[i+1];
        }
        // this will move size -1

        size--;
        return save;
    }
    // display
    void display(){
        if(isEmpty()) return;
        // make copies
        int [] copy_value = new int[size];
        int [] copy_pri = new int[size];
        // copy
        for (int i = 0; i < size ; i++) {
            copy_value[i] = values[i];
            copy_pri[i] = priority[i];

        }
        // sort bubble sort
        for (int i = 0; i < size -1 ; i++) {
            for (int j = 0; j < size -1; j++) {
                if( copy_pri[j] < copy_pri[j+1]){
                    int swapP = copy_pri[j];
                    copy_pri[j] = copy_pri[j+1];
                    copy_pri[j+1] = swapP;
                    // swap value
                    int swapV = copy_value[j];
                    copy_value[j] =  copy_value[j+1];
                    copy_value[j+1] = swapV;
                }
            }
        }
        // display
        for (int i = 0; i < size ; i++) {
            System.out.println(" value "+ copy_value[i]+ " priority "+ copy_pri[i]);
        }
    }
        // peak
    int peak(){
        if(isEmpty()) return -1;
        int h = 0;
        for (int i = 0; i < size ; i++) {
            if(priority[i] > priority[h]){
                h=i;
            }
        }
        return values[h];
    }
    
}
