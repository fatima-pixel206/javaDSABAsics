package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class InfixToPostFixEx {
     String infixtopostfix(String ex) {
        String infix = ex;
        CharStack ops = new CharStack(infix.length());
        Stack<String> post = new Stack<>();
        System.out.println("Infix: "+infix);
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <=57 || Character.isLetterOrDigit(ch)){
                String temp = ""+ ch;
                post.push(temp);
            }
            else if(ops.getSize() ==0 || ch=='(' || ops.peak() == '('){
                ops.push(ch);
            } else if (ch==')') {
                while(ops.peak()!='('){
                    if(ops.size==1 && ops.peak()!='(') {
                       return "invalid expression";
                    }
                    String v2 = post.pop();
                    String v1 = post.pop();
                    char op = ops.pop();
                    String works = v1+v2+op;
                    post.push(works);
                }
                ops.pop();// remove'('
            }// end else if
            else {
                if(InfixEvaluttion.priority(ch)==1){
                    String v2 = post.pop();
                    String v1 = post.pop();
                    char op = ops.pop();
                    String work = v1+v2+op;
                    post.push(work);
                    ops.push(ch);

                } else if (InfixEvaluttion.priority(ch)== 2) {
                    if(InfixEvaluttion.priority(ch)== InfixEvaluttion.priority(ops.peak())){
                        String v2 = post.pop();
                        String v1 = post.pop();
                        char op = ops.pop();
                        String work = v1+v2+op;
                        post.push(work);
                        ops.push(ch);
                    }
                    else {
                        ops.push(ch);
                    }
                }
            }

        }// end for
        while(post.size()!=1){
            String v2 = post.pop();
            String v1 = post.pop();
            char op = ops.pop();
            String finalWork = v1+v2+op;
            post.push(finalWork);
        }
         System.out.println(ops.size);
         System.out.println(post.size());
        String postfix = post.pop();
        System.out.println("postfix: "+postfix);
        return postfix;
    }

     void main() {
        System.out.println( infixtopostfix("8+(4*3)+8/4"));
    }
}
