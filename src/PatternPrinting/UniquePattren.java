package PatternPrinting;

import java.util.Scanner;

public class UniquePattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            for (int j = 1; j <= n; j++) {
               // if (i % 2 == 1) {
                    System.out.print((char) (i + 96) + " ");
                }
              //  else {
                    System.out.print((char) (i + 64) + " ");

                }
            }
              //  System.out.println();
//            //for (int k = 1; k <=n ; k++) {
//                System.out.print( (char)(i+97)+" ");
//            }
//            System.out.println();
//
            }
       // }
   // }
