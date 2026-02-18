package If_Else;

import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
        if(n > 999 && n < 10000){
            System.out.println(" this is four digit number");
        }
        else{
            System.out.println(" Not a four digit number");
        }
        sc.close();
    }
}
class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        int n= Math.abs(num);
        int i = 0;
        if(n == 0){
            i = 1;
        }
        else{



        while (n > 0) {
            int digit = n % 10;
            i++;
            n = n / 10;

        }
            if (i == 4) {
                System.out.println(" 4 digit ");
            } else {
                System.out.println(" not a four digit number");
            }
        }

    }}
