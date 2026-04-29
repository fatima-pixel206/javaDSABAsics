package If_Else.Stack.Learning;

public class OnlyPushAndPoP {
    int size = 5;
    int top =-1;
    int[] stack = new int[size];
    void push(int v){
        // if full
        if(top == size -1){
            System.out.println(" stack is full");
            return;
        }
        else {
            top++;
            stack[top]= v;
        }
    }
    int pop(){
        if(top== -1){
            System.out.print(" stack is empty ");
            return -1;
        }

        else {

            return stack[top--];
        }

    }
}
