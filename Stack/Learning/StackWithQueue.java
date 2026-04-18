package If_Else.Stack.Learning;

public class StackWithQueue {
    private int size;
        int [] stack;
        int top=-1;
    public int getSize() {
        return top+1;
    }

    public void setSize(int size) {
        this.size = size;
        this.stack= new int[size];
    }
    //is empty
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
            return false;
    }
    // check if full
    public boolean isFull(){
        if(top==size-1){
            return true;
        }
        else
            return false;
    }
    // push
    public void push(int n){
        if (isFull()){
            System.out.println(" stack is full");
            return;
        }
        else{
            top++;
            stack[top]=n;
        }
    }
    // pop
    public void pop(){
        if(isEmpty()){
            System.out.println(" stack is empty");
            return;
        }
        else
            top--;
    }

    // on top val
    public int Top(){
        if(isEmpty()){
            System.out.println(" stack is empty");
            return -1;
        }
        else return stack[top];
    }
    // get size

}
