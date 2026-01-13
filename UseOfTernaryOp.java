package Ternary_Oprator;

import java.util.Scanner;

public class UseOfTernaryOp {
    public static void main(String[] args) {
        // ternary operator is short version of if else conditions
        // ?
         Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int num = sc.nextInt();
        // first write a condition then ? true : false
        System.out.println( num%2==0 ? " even " : "odd");
        int c= (num%2 == 0 ? num :  num%2);
        System.out.println(c);
        
    }
}
