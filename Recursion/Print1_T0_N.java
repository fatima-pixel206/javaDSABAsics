package If_Else.Recursion;

import java.util.Scanner;

public class Print1_T0_N {

     void printseq(int x,int y){
         if(x>y) return;
         System.out.print(x+" ");
         printseq(x+1,y);
     }
// another appr
    void printApp2(int n){
         if(n==0){
             return;
         }
        System.out.print(n+" ");
         printApp2(n-1);
         if(n!=1)
        System.out.print(n+" ");


    }

     void main() {
         Scanner sc = new Scanner(System.in);
         int n=  sc.nextInt();
        //printseq(1,n);
        printApp2(n);
    }
}
