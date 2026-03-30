package If_Else.Stack;

import java.util.Stack;
// Builtin
public class Initialization {
    static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        // adding numbers
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
// push method add a number to the stack
        System.out.println("Top element "+st.peek());
        // peak method shows only top of the index here it will show 5
        st.pop();
        // pop method delete top element
        System.out.println("Top element "+st.peek());
        // now it will show 4
        System.out.println( st.empty());
    }

}
