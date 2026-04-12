package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class CountDigitInANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int c=0;
        if(n==0){
            c=1;
        }
        while (n>0){
            n=n/10;
         //   System.out.println(n);
            c++;
        }
        System.out.println(c);
    }
}
