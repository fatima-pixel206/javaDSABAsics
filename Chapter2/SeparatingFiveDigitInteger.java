package Chapter2;

import java.util.Scanner;

/*
Dated 3,March 2026
separate five-digit numbers
 */
public class SeparatingFiveDigitInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a five digit integer: ");
        int number = sc.nextInt();
//        if(number > 9999 && number < 999999) {
//
//            while (number > 0) {
//                int lastDigit = number % 10;
//                //   System.out.print(number);
//                System.out.print(lastDigit + " ");
//                number = number / 10;
//
//            }
//        }
        // Note: the upper method will give reverse value
        separate(number);

    }
    public static void separate(int number){
        int five=10000;
        for (int i = 0; five > 0 ; i++) { // this can also write as
            // for(int i=10000; i> 0;i/=10)
            //int five=10000;
            int lastDigit= number / five; // finding first number
            System.out.print(lastDigit+" ");
            number=number % five; // decreasing number
            five = five/10; // decreasing five digit

        }
    }

}
