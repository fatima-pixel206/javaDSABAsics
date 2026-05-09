package If_Else.Recursion;

import java.util.Scanner;

public class PrintEvenOdd {
     static void even(int n){
        if( n <= 0)return;
        if(n%2==0){

            System.out.println(n+" is even ");
        }
        //else System.out.println(n+" is even ");

        odd(n-1);
    }
    static void odd(int n){
        if( n<=0) return;
        if(n%2==1)
         System.out.println(n+" is odd ");

        even(n-1);
    }

    static void main(String[] args) {
       // odd(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
//        if(n%2==1)odd(n);
//        else
//            even(n);
        if(n%2==1)oddA(n);
        else evenA(n);
        //odd(2);
    }
    // accending order 1 to n
   static void evenA(int n){
         if(n<=0)return;
         oddA(n-1);
         if(n%2==0)
        System.out.println(n+" even number");
    }
   static void oddA(int n){
         if(n<=0)return;
         evenA(n-1);
         if(n%2!=0) System.out.println(n+" odd");
    }
}
