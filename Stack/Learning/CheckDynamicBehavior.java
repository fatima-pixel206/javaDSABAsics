package If_Else.Stack.Learning;

import java.util.Stack;

public class CheckDynamicBehavior {
    static void main() {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.capacity());
        st.push(86);
        st.push(890);
        st.push(389);
        st.push(859);
        st.push(849);
        st.push(894);
        st.push(189);
        st.push(849);
        st.push(894);
        st.push(189);
        st.push(849);
        st.push(894);
        st.push(189);
        System.out.println(st.size());
        System.out.println(st.capacity());
            st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.size());
        System.out.println(st.capacity());// still cap is 20
        // because memory is reversed and not going to resize
        // it would be more time taken

    }
}
