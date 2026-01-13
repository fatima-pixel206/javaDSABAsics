package If_Else;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        for (int i = 1; n > 0; ) {
            int digit = n - (n / 10 * 10);
        rev=rev*10+digit;
        n=n/10;
            System.out.println(rev);
        }
    }
}