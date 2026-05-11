package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PostFixToInfixExprssion {
    static void main() {
        String post = "ab+c*d+";//(8+(((9*2)-5)+1))
        Stack<String> st = new Stack<>();
        for (int i = 0; i < post.length(); i++) {
            char ch = post.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                String typ = "" + ch;
                st.push(typ);
            } else {
                if (st.size() < 2) return;

                    String v2 = st.pop();
                    String v1 = st.pop();
                    String work = v1 + ch + v2;
                    st.push(work);


            }
        }
        System.out.println(st.peek());
    }
}
