package WhileLoop;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int a = sc.nextInt();
        System.out.println(" Enter a number ");
        int b = sc.nextInt();
        int p=1;
        for (int i = 1; i <=b ; i++) {
            p=p*a;
            System.out.println(p);
        }
    }
}