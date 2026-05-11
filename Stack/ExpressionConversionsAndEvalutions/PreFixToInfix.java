package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PreFixToInfix {
    static void main() {
        String pre = "++8*43/84";
        Stack<String> val = new Stack<>();
        for (int i = pre.length()-1; i >=0; i--) {
            char ch=pre.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                String tpe = ""+ch;
                val.push(tpe);
            }
            else {
                if(val.size()<2)return;
                String v1 = val.pop();
                 String v2 = val.pop();
                 String work = '('+v1+ch+v2+')';
                val.push(work);
            }
        }
        System.out.println(val.peek());
    }
}
