
package Chapter2;
// * ! is this is important to write package name in java or not?
import java.util.Scanner;

public class Addition {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int a = sc.nextInt();
        System.out.printf("Enter second number: ");
            int b= sc.nextInt();
            int sum= a+b;
            System.out.printf("%s %d "," Sum is ",sum);
            sc.close();
    }
    public void sum(int a,int b){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
         a = sc.nextInt();
        System.out.printf("Enter second number: ");
         b= sc.nextInt();
        int sum= a+b;
        System.out.printf("%s %d "," Sum is ",sum);
        sc.close();
    }
}
