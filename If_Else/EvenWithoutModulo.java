package If_Else.If_Else;

import java.util.Scanner;

public class EvenWithoutModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        if ((n / 2) * 2 == n) {
            System.out.println(" Even");
        } else {
            System.out.println(" odd");
        }
    }
}
