package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        int num = sc.nextInt();
        int nst=1;
        for (int i = 1; i <=2*num-1 ; i++) {

            System.out.print("*"+" ");
        }
        //
        System.out.println();
        for (int i = 1; i <= num-1; i++) {
            // System.out.println(i);
            for (int j = 1; j <= num-i; j++)
            {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print(" "+" ");
            }
            nst+=2;
            for (int j = 1; j <=num-i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}