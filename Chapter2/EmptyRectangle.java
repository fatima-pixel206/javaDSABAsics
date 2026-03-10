package Chapter2;

import java.util.Scanner;

public class EmptyRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter Number of rows :");
        int rows = input.nextInt();
        System.out.println(" enter Number of columns :");
        int columns = input.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=columns ; j++) {
                if(i==1 || j==1 || i==rows || j==columns){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
