package If_Else.Stack.ExpressionConversionsAndEvalutions;

public class InfixEvaluttion {
    /*
    check precedence of operators
     */
    static int priority(char ex) {
        int prio = 0;
        switch (ex) {
            case '*':
            case '/':
            case '%':
                prio = 2;
                break;
            case '-':
            case '+':
                prio = 1;
                break;
            default:
                prio = 0;


        }
        return prio;
    }

    public static void main(String[] args) {
        // infix evalution
        // make two empty stacks
        String str = "9+4-9/4-1";
        CharStack op = new CharStack(str);

        StackInterger inte = new StackInterger(str.length());
        //System.out.println(op.peak());
        //System.out.println(op.cap);
        for (int i = 0; i < str.length(); i++) {
            // save single char
            char c = str.charAt(i);
            // convert int assci value
            int assi = (int) c;// assci value of any char
            // type casting
            // check if number
            // the assci integr value of '0' is 48 and '9' is 57 so 0 to 9
            // assci value are 48 to 57
            if (assi >= 48 && assi <= 57) {
                // push to vlaue stack
                inte.push(assi - 48);//
                // if number is  5 then its assci value is 53
                // 53 -48 = 5 ;number was now pushed in stack
            } else if (op.getSize() == 0) {
                op.push(c);// direct push
            } else {
                // char can b eqaul or greater then 1 there is + - next op can b one from any 4 oper
               if (priority(c) == 1){
                   // work
                   int v2 = inte.pop();
                   int v1= inte.pop();
                   if(op.peak()=='-')inte.push(v1-v2);
                   if(op.peak()=='+')inte.push(v1+v2);
                   if(op.peak()=='/')inte.push(v1/v2);
                   if(op.peak()=='*')inte.push(v1*v2);
                   op.pop();// delete current op
                   op.push(c);// ad next op
               }
             else   if(priority(c)==2){
                   if(priority(op.peak())== priority(c)){
                       // work
                       int v2 = inte.pop();
                       int v1= inte.pop();

                       if(op.peak()=='/')inte.push(v1/v2);
                       if(op.peak()=='*')inte.push(v1*v2);
                       op.pop();// delete current op
                       op.push(c);// ad next op

                   }
                   else {
                       op.push(c);
                   }
               }
            }
        }
        // empty stack of integer
        while(inte.size>1){
            int v2 = inte.pop();
            int v1 = inte.pop();

            if(op.peak()=='-')inte.push(v1-v2);
            if(op.peak()=='+')inte.push(v1+v2);
            if(op.peak()=='/')inte.push(v1/v2);
            if(op.peak()=='*')inte.push(v1*v2);
            op.pop();// delete current op

        }
        System.out.println(inte.peak());

    }
}
