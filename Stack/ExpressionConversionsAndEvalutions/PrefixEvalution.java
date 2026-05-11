package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class PrefixEvalution {
    String prefixEva(String ex) {
        StackInterger val = new StackInterger(ex.length());

        for (int i = ex.length() - 1; i >= 0; i--) {
            char ch = ex.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch -'0');
            } else {
                if(val.size<2) return "invalid expression";
                int num1 = val.pop();
                int num2 = val.pop();

                    if (ch == '+') val.push(num1 + num2);
                    if (ch== '-') val.push(num1 - num2);
                        if (ch == '/') val.push(num1 / num2);
                        if (ch == '*') val.push(num1 * num2);

                    }
                }

        // end for

        String prefixed = ""+val.pop();
        return prefixed;
    }

     void main() {
        System.out.println(prefixEva("-62"));
         System.out.println(9-8);
         System.out.println((9-8)*2/2);
    }
}