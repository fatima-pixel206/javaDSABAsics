package PatternPrinting;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//int min;
        System.out.println(" enter a number ");
        int num = sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {
                // System.out.print(Math.min(i,j)+" ");
                System.out.print((i<=j)? i +" ": j +" ");
//                if(i<=j){
//                    System.out.print(i+" ");
//                }
//                else {
//                    System.out.print(j+" ");
//                }
            }
            System.out.println();
        }
    }
}
