package WhileLoop;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int count = 0;
        // int digit;
        if (n == 0) {
            n = 1;
           // System.out.println(n+" Digit number" );
        }



        while (n != 0) {
            n = n / 10;
            //digit= n;
            count++;


        }
        System.out.println(count + " digit numbers ");
    }

}
