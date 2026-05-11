package If_Else.Stack.Learning;

public class PaperPrepStack {

    int size ;
    int[]ar;
    int top;
    int cap;
    public PaperPrepStack(int cap){
        this.cap= cap;
        this.ar= new int[cap];
        this.top=-1;
        this.size=0;

    }
    // isfull
    boolean isFull(){
        return size == cap;
    }
   public boolean isEmpty(){

        return size == 0;
    }
    // is push
    void push (int data){
        if(isFull()){
            System.out.println(" stack is full ");
            return;
        }
        top++;
        ar[top]=data;
        size++;
    }
    // pop
    int pop(){
        if(isEmpty()){
            System.out.println(" stack is null ");
            return top;
        }
        int save =  ar[top];
        top--;
        size--;
        return save;
    }
    // getsize
    int getSize(){
        return this.size;

    }
    int getcap(){
        return this.cap;

    }
        void display(){
        if (isEmpty()){ System.out.println(" null");return;}
            System.out.println(" stack elements ara ");
            for (int i = top; i >=0; i--) {
                System.out.print(ar[i]+" ");
            }
        }
        // peak
    int peak(){
        if(isEmpty())
        {
            System.out.println(" stack is under flow"); return top;
        }
        return ar[top];
    }
    // copy
    int [] copy(){
        if(isEmpty()) {
            System.out.println(" stack is empty.."); return ar;
        }
        int[] copy = new int[size];
        for (int i = top; i >= 0 ; i--) {
            copy[i]=ar[i];
        }
        return copy;
    }
    // reverse
    void reverse(){
        if(isEmpty()) {System.out.println("stack is empty"); return ;};

       int i=0;
       int j=top;
       while(i<j){
            int rev = ar[i];
            ar[i]= ar[j];
            ar[j]= rev;
            i++;
            j--;
        }

    }// revusivley revers
    void reversrec(){
        if(isEmpty())return;
        int temp = pop();
        reversrec();

        insetBottom(temp);
    }// helper
    void insetBottom(int data){
        if(isEmpty() ) {push(data); return;}
        int temp = pop();
        insetBottom(data);
        push(temp);


    }
}
