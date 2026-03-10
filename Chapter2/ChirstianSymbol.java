package Chapter2;

import java.util.Scanner;

public class ChirstianSymbol {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = input.nextInt();
//       for (int i = 1; i <=rows; i++) {
//           for (int j = i; j <=rows ; j++) {
//               System.out.print("  *");
//           }
//           System.out.println();
//       }
//       for (int i = 1; i <=rows; i++) {
//           for (int j = 1; j <=i ; j++) {
//               System.out.print(" * ");
//           }
//           System.out.println();
//       }
       for (int i = 1; i <=rows; i++) {
           for (int j = 1; j <=rows-i ; j++) {
               System.out.print("  ");
           }
           for (int j = 1; j <=i ; j++) {
               System.out.print(" *  ");
           }

           System.out.println();
       }
       for (int j = 1; j <=rows ; j++) {
           System.out.println("        *     ");
       }
    }
}
