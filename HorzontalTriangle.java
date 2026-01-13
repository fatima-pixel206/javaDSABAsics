package PatternPrinting;

import java.util.Scanner;

public class HorzontalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
        int a= n;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print( j+"  ");
//
//            }
//            System.out.println();
//    }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=n+1- i; j++) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//    }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print(j+" ");

            }
            a--;
            System.out.println();
        }
    }
}