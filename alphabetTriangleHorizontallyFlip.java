package PatternPrinting;

import java.util.Scanner;

public class alphabetTriangleHorizontallyFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n+1-i ; j++) {
//                System.out.print((char)(j+96)+" ");
//
//            }
//            System.out.println();
       // }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print((char)(i+96)+" ");

            }
            System.out.println();
        }
    }
}
