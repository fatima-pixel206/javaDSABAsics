package Chapter2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("Number is "+oddOrEven(n1));

    }
    public static String oddOrEven(int a){
        if(a%2 != 0)
            return "odd";
        else
            return "even";
    }
}
