package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class Factorial {
    static void main() {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact =1 ;
        if(n>0){
            for (int i = 1; i <= n ; i++) {
                fact=fact*i;
            }
        }
        System.out.println(n+"! = "+fact);
    }
}
