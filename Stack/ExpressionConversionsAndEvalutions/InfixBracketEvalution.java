package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class InfixBracketEvalution {
    static void main() {

        String st = "2+9-(7*6)+9/8";
        StackInterger val = new StackInterger(st.length());
        CharStack op = new CharStack(st);
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci <=57){
                val.push(asci-48);
            } else if (op.size==0 || ch=='('|| op.peak() =='(') {
                op.push(ch);
            }
            else if(ch==')'){
                //work
                while(op.peak()!='('){
                    int v2= val.pop();
                    int v1 =val.pop();
                    if(op.peak()=='-')val.push(v1-v2);
                    if(op.peak()=='+')val.push(v1+v2);
                    if(op.peak()=='/')val.push(v1/v2);
                    if(op.peak()=='*')val.push(v1*v2);
                    op.pop();// delete current op

                }
                op.pop();// remove> (
                //no push )
            }
            else {
                if(InfixEvaluttion.priority(ch)==1){
                    int v2= val.pop();
                    int v1= val.pop();
                    if(op.peak()=='-')val.push(v1-v2);
                    if(op.peak()=='+')val.push(v1+v2);
                    if(op.peak()=='/')val.push(v1/v2);
                    if(op.peak()=='*')val.push(v1*v2);
                    op.pop();// delete current op
                    op.push(ch);
                }
                else if (InfixEvaluttion.priority(ch)==2) {
                    if(InfixEvaluttion.priority(op.peak())==InfixEvaluttion.priority(ch)){
                        int v2= val.pop();
                        int v1= val.pop();
                        if(op.peak()=='/')val.push(v1/v2);
                        if(op.peak()=='*')val.push(v1*v2);
                        op.pop();
                        op.push(ch);
                    }
                    else {
                        op.push(ch);
                    }
                }

            }
        }
        // final step
        while(val.getSize()!=1){
            int v2= val.pop();
            int v1= val.pop();
            if(op.peak()=='-')val.push(v1-v2);
            if(op.peak()=='+')val.push(v1+v2);
            if(op.peak()=='/')val.push(v1/v2);
            if(op.peak()=='*')val.push(v1*v2);
            op.pop();
        }
        System.out.println(val.peak());
    }
}
