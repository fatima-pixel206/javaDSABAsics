package If_Else.BasicOfDSA;

import java.util.Scanner;

public class SwapOfTwoNumbers {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(" Initial value  of a is : " + a);
        System.out.println(" Initial value  of b is : " + b);
        // a= 5 b=3
        a=a-b;// 5-3=2 a=2
        b=a+b;//2+3=5
        a=b-a;// 5-2=3
        System.out.println(" After swaping of a is : " + a);
        System.out.println(" After swaping of b is : " + b);

    }
}
