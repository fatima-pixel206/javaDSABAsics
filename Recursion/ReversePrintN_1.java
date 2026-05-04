package If_Else.Recursion;

public class ReversePrintN_1 {
    static void printrevp(int n){
        if(n ==0 ) return;
        System.out.print(n+" ");
        printrevp(n-1);
        //System.out.print(n+" ");
    }

    static void main() {
        printrevp(5);
    }
}
