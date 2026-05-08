package If_Else.Stack;



class MyStack {
    int arr[] = new int[10];
    int top = -1;
    int size;

    void push(int x) {
        top++;
        arr[top] = x;
        size++;
    }

    int pop() {
        int data = arr[top];
        top--;
        size--;
        return data;
        

    }
    // display

    public int getSize() {
        return size;
    }
    int peak(){
        if(top==-1)return top;
        return arr[top];
    }
}