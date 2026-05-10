package If_Else.Stack.ExpressionConversionsAndEvalutions;

import java.util.Stack;

public class InfixToPrefix {
    static void main() {
        Stack<String> pre = new Stack<>();
        String infix = "9-(5+3)*4/6";
        System.out.println("infix: "+infix);
       // System.out.println(pre);
        CharStack op = new CharStack(infix.length());
         for(int i = 0; i  <infix.length(); i++){
             char ch = infix.charAt(i);
             int asci = (int)ch;
            if(asci >= 48 && asci <= 57 || Character.isLetterOrDigit(ch)){
                String type = ""+ch;// converting char into string of char is 0 to 9
                pre.push(type);

            }
            else if( op.getSize() == 0 || ch =='('|| op.peak() == '('){
                op.push(ch);
            }
            else if (ch==')') {
                while(op.peak()!='('){
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    char ops = op.pop();
                    String work =ops+v1+v2;
                    pre.push(work);
                }
                op.pop();// remove '('
            } // esle if end
             else {
                 if(InfixEvaluttion.priority(ch)==1){
                     String v2 = pre.pop();
                     String v1 = pre.pop();
                     char ops = op.pop();
                     String work = ops+ v1+v2;
                     pre.push(work);
                     op.push(ch);
                 }
                 else if(InfixEvaluttion.priority(ch)==2){
                     if(InfixEvaluttion.priority(ch)== InfixEvaluttion.priority(op.peak())){
                         String v2 = pre.pop();
                         String v1 = pre.pop();
                         char ops = op.pop();
                         String work = ops+ v1+v2;
                         pre.push(work);
                         op.push(ch);
                     }
                     else {
                         op.push(ch);
                     }
                 }
            }
         }//end for
        while(pre.size()>1){
            String v2 = pre.pop();
            String v1 = pre.pop();
            char ops = op.pop();
            String work = ops+ v1+v2;
            pre.push(work);

        }
        String prefix = pre.pop();
        System.out.println("prefix: "+prefix);
        

    }//end main
}
