package PatternPrinting;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class NumberAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            // System.out.println(i);
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print((char) (j + 64) + " ");
                }
//            for (int j = 1; j <=i+1 ; j++) {
//
//                System.out.print( (char)(j+64)+" ");
            }
            System.out.println();

        }
    }
}