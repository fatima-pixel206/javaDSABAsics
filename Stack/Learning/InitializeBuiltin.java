package If_Else.Stack.Learning;

import java.util.*;

public class InitializeBuiltin {
    static void main() {
        Stack <Integer> st = new Stack();
        System.out.println(st.capacity());
        System.out.println(st);
        System.out.println(st.size());
        st.push(45);
        System.out.println(st);
        System.out.println(st.size());
       // st.pop();
        st.push(87);
        st.push(78);
        System.out.println(st);
        st.pop();
        st.push(87);
        st.push(78);
        st.push(87);
        st.push(78);
        st.push(87);
        st.push(78);
        st.push(87);
        st.push(78);
        st.push(87);
        st.push(78);
        System.out.println(st.capacity());
        System.out.println(st);
    }
}
