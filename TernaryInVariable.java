package Ternary_Oprator;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a number ");
        int n= sc.nextInt();
        int num = n>0 ? n+5 : 0;
        System.out.println(num);



    }
}
