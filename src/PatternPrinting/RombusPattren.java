package PatternPrinting;

import java.util.Scanner;

public class RombusPattren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter rows ");
        int row = sc.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row+1-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=row ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}