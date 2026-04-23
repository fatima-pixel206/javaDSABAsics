package If_Else.Stack;

public class ExpressionConversion {
    public int checkPrecedence(char a){
        int pre=0;
        switch (a){
            case '+':
            case'-':
                pre= 1;

                break;
            case '*':
            case '/':
            case '%':
                pre= 2;
             break;
            default:
                pre = 0;

        }
        return pre;
    }


    public String conversion(String ex){
        CharStack c = new CharStack(ex);
        String  res = "";
        for (int i = 0; i <ex.length() ; i++) {
            char temp = ex.charAt(i);
            if (Character.isLetterOrDigit(temp)) {
                res = res+temp;
            }
            else if (temp == '(') {
                c.push(temp);

            } else if (temp == ')') {
                while (!c.isEmpty() && c.peak() != '(') {
                    res = res+c.pop();
                }
                c.pop();
            }
            else {
                while (!c.isEmpty() && checkPrecedence(temp) <= checkPrecedence( c.peak())) {
                    res = res + c.pop();

                }
                c.push(temp);
            }
        }
                while (!c.isEmpty()){
                    if(c.peak()=='(') {
                        return "Invalid expression";
                    }
                        else{
                            res=res+c.pop();
                        }


            }
        return res;
        }
/// infix to prefix
//        public String revers(String ex){
//            StringBuilder result = new StringBuilder();
//            for (int i = ex.length()-1; i>=0 ; i--) {
//                //rev=rev+str.charAt(i);//this method is slow and space taking
//                result.append(ex.charAt(i));
//            }
//            // return rev;
//            return result.toString();
    public String infixToPreFix(String ex){
        CharStack let = new CharStack(ex);
        String result = "";
        for (int i = 0; i <ex.length() ; i++) {

            char sym = ex.charAt(i);
            if(Character.isLetterOrDigit(sym)){
                let.push(sym);
            } else if (sym == '(') {

                let.push(sym);
            }
            else if (sym==')') {
               while (!let.isEmpty() && let.peak()!='('){
                   char tempo= let.pop();
                   result=result+let.pop();
                   result=result+tempo;
               }
               let.pop();
            }
            else{char deh= ' ';
                if(i>0)
                deh = result.charAt(i-1);
               if(checkPrecedence(sym)<= checkPrecedence(deh)){
                   result=result+sym;
               }
               else {
                   let.push(sym);
               }
            }

        }
        while (!let.isEmpty() )
        {
            if(let.peak()=='(')
                return "invalid expression";
            else
                result=result+let.pop();
        }

        return result;
}

    static void main() {
        ExpressionConversion check = new ExpressionConversion();
        System.out.println(check.conversion("((a+b)*(e-f)/d)"));
     //   System.out.println(check.revers("(a+b)*(e-f)/d"));
        System.out.println(check.infixToPreFix("a+b"));
//        CharStack s = new CharStack("(a+b)*d");
//        s.push('a');
//        s.push('b');
//        String b = "";
//        char tem= s.pop();
//        System.out.println(tem);
//        b=b+s.pop();
//        b=b+tem;
//        System.out.println(b);
    }

    }

