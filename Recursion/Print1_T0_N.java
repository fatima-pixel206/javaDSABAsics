package If_Else.Recursion;

import java.util.Scanner;

public class Print1_T0_N {

     void printseq(int x,int y){
         if(x>y) return;
         System.out.print(x+" ");
         printseq(x+1,y);
     }

     void main() {
         Scanner sc = new Scanner(System.in);
         int n=  sc.nextInt();
        printseq(1,n);
    }
}
