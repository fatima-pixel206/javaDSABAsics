package If_Else.Queue.Priority;

public class PriorityCheck {
    int size;
    int cap;
    int[]pri;
    int[] val;
    PriorityCheck(int cap){
        this.cap = cap;
        this.pri = new int[cap];
        this.val = new int[cap];
        size =0;
    }
    boolean isfull(){
        if(size == cap) return true;
        else return false;
    }
    boolean isempty(){
        if(size == 0) return true;
        else return false;
    }

    // add
    void enque(int value,int priority){
        if(isfull()) {
            System.out.println(" full");
            return;
        }
        if(size ==0){
           this.pri[size]= priority;
           this.val[size] = value;
           size++;
           return;
        }
        else {
            val[size] = value;
            pri[size] = priority;
            size++;
            // sort
            for (int i = 0; i <size -1 ; i++) {
                for (int j = 0; j <size-i-1 ; j++) {
                    if(pri[j]>pri[j+1]){
                        int temppri= pri[j];
                        pri[j] = pri[j+1];
                        pri[j+1] = temppri;
                        int tempval = val[j];
                        val[j] = val[j+1];
                        val[j+1] = tempval;

                    }
                }
            }

            // now add

        }
    }
    // dequw
    int deque(){
        if(isempty()){
            System.out.println(" empty");
            return -1;
        }
        int save = val[size-1];
        size--;
        return save;
    }
    // disolay
    void display(){
        if(isempty()) return;
        System.out.println(" high priority at top");
        for (int i = size-1; i >= 0; i--) {
            System.out.println("value :"+val[i]+" priority: "+pri[i]);
        }

    }
    int peak(){
        if(isempty()) return -1 ;
        return val[size-1];
    }
}
