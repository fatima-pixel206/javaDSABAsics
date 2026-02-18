package WhileLoop;

import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        System.out.println(revarse(n));
//        int digit=0;
//
//        while(n != 0){
//            digit=n%10;
//            n=n/10;
//            System.out.print(digit);
        }

    // or
    public static int revarse(int n){
        int digit;
        int rev=0;

        while(n !=0){
            rev = rev *10;

            digit = n %10;
            rev=rev+digit;

            n=n/10;
        }
        return rev;

}
}