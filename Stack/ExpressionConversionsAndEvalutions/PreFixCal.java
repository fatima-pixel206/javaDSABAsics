package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class PreFixCal {
    static void main() {
    String st = "++8*43/84";

    StackInterger val = new StackInterger(st.length());
        for (int i = st.length()-1; i >=0 ; i--) {
            char ch =st.charAt(i);
            int asc = (int)ch;
            if(asc >= 48 && asc<= 57 || Character.isLetterOrDigit(ch)){
                val.push(ch-'0');
            }
            else{
                if(val.getSize()<2)return;
                int v1 = val.pop();
                int v2=val.pop();

                    if(ch=='-')val.push(v1-v2);
                    if(ch=='+')val.push(v1+v2);
                    if(ch=='*')val.push(v1*v2);
                    if(ch=='/')val.push(v1/v2);
                }


            }
        String  evp =""+ val.pop();
        System.out.println(evp);
        }
    }

