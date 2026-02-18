package WhileLoop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int sum = 0;
        //  int LastDigit ;
        if (n <= -1) {
            n=Math.abs(-n);
        }
            while (n != 0) {
                //LastDigit = n % 10;
                //  n = n / 10;
                sum = sum + n % 10;
                n = n / 10;
            }
            System.out.println(sum);
        }
        }

