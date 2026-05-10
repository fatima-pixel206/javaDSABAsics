package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class PostFixEvalution {


    String postfixEvalutton(String stinfix) {
        String pst = stinfix;
        StackInterger val = new StackInterger(pst.length());
        for (int i = 0; i < pst.length(); i++) {
            char ch = pst.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch-'0');
            }
                else{
                    if(val.getSize()<2) return "Invalid expression";
                    int num2 =val.pop();
                    int num1 = val.pop();
                    if(InfixEvaluttion.priority(ch)==1){
                        if(ch=='+')val.push(num1+num2);
                        if(ch=='-')val.push(num1-num2);
                    }
                    else  {
                        if(ch=='*')val.push(num1*num2);
                        if(ch=='/')val.push(num1/num2);
                    }
            }
        }
        String convert = ""+val.pop();
        System.out.println("postfix evalution :"+convert);
        return convert;
    }

     void main() {
         System.out.println(postfixEvalutton("8-"));
        int a ='9'-'0';
         System.out.println(a+7);
         System.out.println((8+9)*5-5);
         System.out.println(('5'-'0')+6);
    }
}