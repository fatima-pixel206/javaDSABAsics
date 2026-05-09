package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class StackInterger {
    int size ;
    int top;
    int[] stack;
    int cap;
    public StackInterger(int cap){
        this.cap= cap;
        this.stack= new int[cap];
        this.top=-1;
    }
    int getSize(){
        return this.size;
    }
    // check full
    boolean isFUll(){
        if(size== cap) return true;
        else return false;
    }
    boolean isEmpty(){
        if(size== 0) return true;
        else return false;
    }
    // peak
    int peak(){
        if(isEmpty()) return top;
        return stack[top];
    }
    // push
    void push(int val){
        if(isFUll()){
            System.out.println(" stack is over flow!");
            return;
        }
        stack[++top]= val;
        size++;
    }
    // pop
    int pop()
    {
        if(isEmpty()){
            System.out.println(" empty>>>>");
            return -1;
        }
        int save = stack[top];
        top--;
        size--;
        return save;
    }
}
