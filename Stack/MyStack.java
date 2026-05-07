package If_Else.Stack;



class MyStack {
    int arr[] = new int[10];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int data = arr[top];
        top--;
        return data;
        
        
    }
    // display

}