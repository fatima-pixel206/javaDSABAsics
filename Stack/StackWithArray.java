package If_Else.Stack;

public class StackWithArray {

        int size= 6;
        int []arr= new int[size];
        int top =-1;
        //check the stack is empty or not
    boolean isEmpty()
    {
       return (top==-1);
    }// if empty return true
        // push method
        void push(int x){
            if( top== size-1){
                System.out.println(" Stack Overflow!");
            }
            else{
                arr[++top]=x;
            }
        }
        // peak method
     int peak(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }
        else {
            return arr[top];
        }
     }
        // pop method
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");

        } else {
            int data = arr[top--];

        }
    }
        // void display
        void display(){
            if(isEmpty()) {
                System.out.println("[]");
                return;
            }
            System.out.print("[");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]+", ");
            }
            System.out.print("]");
        }


    static void main() {
        StackWithArray st = new StackWithArray();
            st.display();
       // st.pop();
        System.out.println(st.size);
        System.out.println(st.isEmpty());
        System.out.println(st.peak());
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        st.display();
    }
    }






