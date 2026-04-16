package If_Else.Stack.Learning;
// reverse a string with help of stack


// stack is nothing but an array
// we are using array with different rule
public class StackOfArray {
     int size;
        int top=-1;

    char  [] arr ;
//
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size=size;
        this.arr=  new char[size];
    }
  //  char  [] arr = new char[size];


    // check stack is empty or not
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    // check stack is full or not
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        else
            return false;
    }
    // push method / add values
    public void push(char val) {
        if (top==size-1) {
            System.out.println(" stack is full");
        }
        else {
            top++;
            // first we increase b c top is -1
            arr[top] = val;
        }
    }
    // pop method
    public void pop(){
        if(isEmpty()){
            System.out.println(" stack is already empty");
        }
        else
  top--;
    }
    // peak
    public char peak(){
        return arr[top];
    }
    /// main

    static void main(String[] args) {
        StackOfArray st = new StackOfArray();
        st.setSize(5);
        st.push('H');
        st.push('E');
        st.push('L');
        st.push('L');
        st.push('O');
        st.push('H');
        int top=-1;
        top++;
        System.out.println(top);
        System.out.println(st.peak());
        System.out.println(st.size);
        System.out.println(st.top);
        String result=" ";
        for (int i = 0; i <st.size ; i++) {
            result=result+st.peak();
            st.pop();
        }
        System.out.println(result);
    }
}
