package If_Else;

public class Factorial {
    static int fact(int n){
       // if(n<=0) return 1;

//        int fact =  n *fact(n-1);
//
//        return fact;
        return n<1 ? 1: n*fact(n-1);
    }

    static void main() {
        System.out.println( fact(910));

    }
}
