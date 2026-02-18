package ForLoopDSA;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n");
        int n = sc.nextInt();
        int a=3;
        int r=2;
        for (int i = 1; i <= n ; i++) {
            System.out.print(a+" ");
            a=a*r;

        }
    }
}