package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PostFixToPreFixEx {
    static void main() {
        String post = "98+4*2/";
        Stack<String> pre = new Stack<>();
        for (int i = 0; i < post.length() ; i++) {
            char ch = post.charAt(i);
            String ty = ""+ch;

            if((int)ch>=48 &&(int)ch<=57){
                pre.push(ty);
            }
            else {
                if(pre.size()<2) return;
                String v2 = pre.pop();
                String v1 = pre.pop();
                String work = ch+v1+v2;
                pre.push(work);
            }
        }
        System.out.println(pre.peek());
    }
}
