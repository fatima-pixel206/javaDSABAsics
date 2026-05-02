package If_Else.Queue.Priority;

public class Implementation {
    int cap;
    int size;
    int[] values;
    int [] pri;
    public Implementation(int cap){
        this.cap = cap;
        this.pri= new int[cap];
        this.values = new int[cap];

    }
    //
    int getSize()
    {
        return this.size;
    }
    void clear(){
        size =0;
    }
    //
    
}
