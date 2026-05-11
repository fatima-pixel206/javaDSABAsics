package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class PostFixEvalut {
    static void main() {
        String str = "843*+84/+";
        StackInterger st = new StackInterger(str.length());
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch-'0');
            }
            else {
                if(st.getSize()<2) return;
                int v2 = st.pop();
                int v1= st.pop();


                    if(ch=='-')st.push(v1-v2);
                    if(ch=='+')st.push(v1+v2);
                    if(ch=='*')st.push(v1*v2);
                    if(ch=='/')st.push(v1/v2);



                }
            }

        String eva = ""+st.pop();
        System.out.println(eva);
    }
}
