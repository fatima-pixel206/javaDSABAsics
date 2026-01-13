package Ternary_Oprator;

import java.io.Serializable;
import java.util.Scanner;

public class LeastNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a number ");
        int a = sc.nextInt();
        System.out.println(" Enter a number ");
        int b = sc.nextInt();
        System.out.println(" Enter a number ");
        int c = sc.nextInt();
        Serializable least =   (a <= b) ? a :(c<=a) ? c  :(b<=a ) ? b : 0 ;
        System.out.println(least);
    }
}
