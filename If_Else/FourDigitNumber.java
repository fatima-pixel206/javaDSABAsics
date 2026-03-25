package If_Else.If_Else;

import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
        if (n > 999 && n < 10000) {
            System.out.println(" this is four digit number");
        } else {
            System.out.println(" Not a four digit number");
        }
        sc.close();
    }
}
