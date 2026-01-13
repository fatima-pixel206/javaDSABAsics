package If_Else;

import java.util.Scanner;

public class DivisibleBYFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print( i+" ");
            }
        }
        System.out.println();
            if (n % 5 == 0) {

                System.out.println( n +" this is divisible by five");
            } else {
                System.out.println( n +" not divisible by five " );
            }
        }
    }

