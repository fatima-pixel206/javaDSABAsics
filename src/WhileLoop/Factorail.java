package WhileLoop;

import java.util.Scanner;

public class Factorail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int fact =1;
        if(n==0 || n<= -1){
            System.out.println(" enter a number greater then one ");
        }
        for (int i = 1; i <=n ; i++) {
            fact =fact * i;
            System.out.println(fact);
        }
        System.out.println(fact);
    }
}
