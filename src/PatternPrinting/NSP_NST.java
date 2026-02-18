package PatternPrinting;

import java.util.Scanner;

public class NSP_NST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
        int nsp = n - 1;// number of spaces
        int nst = 1;// number of stars
        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=nsp ; j++) {
//                System.out.print(" "+" ");
//
//            }
            nsp--;
            for (int j = 1; j <=nst ; j++) {
                System.out.print("*"+" ");
            }
            nst+=2;
            System.out.println();

        }
    }
}
