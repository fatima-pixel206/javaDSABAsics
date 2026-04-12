package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class swapTwoNumbersWithout3rdVar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        int a=sc.nextInt();
        System.out.println("Enter second no:");
        int b=sc.nextInt();
        System.out.println("first number before swaping is "+a);
        System.out.println("second number before swaping is "+b);
        System.out.println("swaping.....");
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println(" now first number is "+a);
        System.out.println(" second number is "+b);

    }
}
