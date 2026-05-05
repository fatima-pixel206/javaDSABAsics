package If_Else.Recursion;

public class PrintEvenOdd {
    void even(int n){
        if( n >=10)return;
        if(n%2==0){
            System.out.println(n+" is even ");
        }

        odd(n+1);
    }
    void odd(int n){
        if( n>=10) return;
        if(n%2==1){
            System.out.println(n+" odd");
        }

        even(n+1);
    }

     void main() {
        even(5);
        odd(2);
    }
}
