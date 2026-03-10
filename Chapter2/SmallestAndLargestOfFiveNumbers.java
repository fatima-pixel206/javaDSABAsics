package Chapter2;

import java.util.Scanner;

/*
Date 1,March,2026

 */
public class SmallestAndLargestOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Enter third number");
        int n3 = sc.nextInt();
        System.out.println("Enter fourth number");
        int n4 = sc.nextInt();
        System.out.println("Enter fifth number");
        int n5 = sc.nextInt();
        System.out.println("Smallest number is :"+smallest(n1,n2,n3,n4,n5));
        System.out.println("Largest number is :"+largest(n1,n2,n3,n4,n5));
    }

    public static int largest(int n1, int n2, int n3, int n4, int n5) {
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
            return n1;
        else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            return n2;
        } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5)
            return n3;
        else if (n4 > n1 && n4 > n3 && n4 > n2 && n4 > n5)
            return n4;
        return n5;
    }
    //
    public static int smallest(int n1, int n2, int n3, int n4, int n5) {
        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
            return n1;
        else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
            return n2;
        } else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5)
            return n3;
        else if (n4 < n1 && n4 < n3 && n4 < n2 && n4 < n5)
            return n4;
        return n5;
    }
}