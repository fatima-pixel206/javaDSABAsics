package Methods.Bultin;

import java.util.Scanner;

public class MinOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  first number");
        int x = sc.nextInt();
        System.out.println(" Enter   second number");
        int y = sc.nextInt();
        System.out.println(" Enter   third number");
        int z = sc.nextInt();
        System.out.println(" Enter   third number");
        int zz = sc.nextInt();
        System.out.println(" MINimum of three number "+Math.min(Math.min(x,y),z));
        System.out.println(" four number "+Math.min(Math.min(Math.min(x,y),z),zz));
    }
}