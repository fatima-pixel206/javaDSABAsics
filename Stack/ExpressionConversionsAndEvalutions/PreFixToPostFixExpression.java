package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PreFixToPostFixExpression {
    static void main() {
        String pre ="/*-9822";
        Stack<String> post = new Stack<>();
        for (int i = pre.length()-1; i >=0 ; i--) {
            char  ch = pre.charAt(i);
            String type = ""+ch;
            if(Character.isLetterOrDigit(ch)){
                post.push(type);
            }
            else {
                if(post.size()<2)return;
                String v1 = post.pop();
                String v2 = post.pop();
                String con = v1+v2+ch;
                post.push(con);
            }
        }
        System.out.println(post.peek());
    }
}
