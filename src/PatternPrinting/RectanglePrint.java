package PatternPrinting;

import java.util.Scanner;

public class RectanglePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter rows ");
        int row = sc.nextInt();
        System.out.println(" Enter col  ");
        int col = sc.nextInt();
        for (int i = 1; i <=row ; i++) {
          // System.out.print(" * ");
            for (int j = 1; j <=col ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}