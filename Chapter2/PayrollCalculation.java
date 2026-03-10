package Chapter2;

import java.util.Scanner;

/*this program performs a sample payroll calculation
Date 28, feb,2026
author Fatima
 */
public class PayrollCalculation {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print(" Enter an integer: ");
         int a = sc.nextInt();
         System.out.println(" Enter your name: ");
          String name = sc.next();//next();// this will read  single word
         // it will not taking space
         //
         String surname = sc.nextLine();
         System.out.println(" Enter something about you:");
         String about = sc.nextLine();// this will take a string with spaces until
         // enter
         System.out.println(" your Name: " + name);
         System.out.println(" About you: " + about);
    }
}
