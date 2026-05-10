package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PostFixEvalution {


    void postfixEvalutton(String stinfix){
        InfixToPostFixEx post = new InfixToPostFixEx();
        String ps =  post.infixtopostfix(stinfix);
        if(ps.equalsIgnoreCase("invalid expression")) {
            System.out.println("invalid expression");
            return;
        }
        String pst = ps;
        CharStack op = new CharStack(pst.length());
        StackInterger val = new StackInterger(pst.length());
        for (int i = 0; i <ps.length() ; i++) {
            char ch = pst.charAt(i);
             int asci =(int)ch;
            if(asci >=48 && asci <= 57 || Character.isLetterOrDigit(ch)){
                val.push(asci-48);
            }
            else if (op.getSize() == 0 ) {
                op.push(ch);
            }


     else {
         if(InfixEvaluttion.priority(ch) == 1){
             int v2 = val.pop();
             int v1 = val.pop();
             if(op.peak()=='-') val.push(v1-v2);
             if(op.peak()=='+') val.push(v1+v2);
             if(op.peak()=='/') val.push(v1/v2);
             if(op.peak()=='*') val.push(v1*v2);
             op.pop();
             op.push(ch);
         }
         else if(InfixEvaluttion.priority(ch)==2){
             if(InfixEvaluttion.priority(ch)==InfixEvaluttion.priority(op.peak())){
                 int v2 = val.pop();
                 int v1 = val.pop();
                 if(op.peak()=='/') val.push(v1/v2);
                 if(op.peak()=='*') val.push(v1*v2);
                 op.pop();
                 op.push(ch);
             }
         }
         else {
             op.push(ch);
         }
            }
        }// end for
        while(val.getSize()!=1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peak()=='/') val.push(v1/v2);
            if(op.peak()=='*') val.push(v1*v2);
            if(op.peak()=='-') val.push(v1-v2);
            if(op.peak()=='+') val.push(v1+v2);
            op.pop();
        }
       // op.pop();
        //System.out.println(op.peak());
        int postfixEva = val.pop();
        System.out.println("Post fix evalute "+postfixEva);
    }

     void main() {
         postfixEvalutton("(5+3)*6/4");
         System.out.println((5+3)*6/4);
    }
}
