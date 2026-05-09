package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class CharStack {
    int size ;
    int top;
    char []stack;
    int cap;
    public CharStack(String str){
        this.cap= str.length();
        this.stack= new char[cap];
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
    char peak(){
        if(isEmpty()) {
            System.out.println(" stack is empty");
            return '0';
        }
        return stack[top];
    }
    // push
    void push(char val){
        if(isFUll()){
            System.out.println(" stack is over flow!");
            return;
        }

        stack[++top] = val;
        size++;
    }
    // pop
    char pop()
    {
        if(isEmpty()){
            System.out.println(" empty>>>>");
            return '0';
        }
        char save = stack[top];
        top--;
        size--;
        return save;
    }

    static void main() {
        CharStack st = new CharStack("fatima");
        System.out.println(st.cap);
        System.out.println(st.getSize());
        st.push('j');
        System.out.println(st.peak());
    }
}



