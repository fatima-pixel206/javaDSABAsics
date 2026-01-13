package WhileLoop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SumAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int digit  = 0;
        int sum=  0;
        int rev = 0;
        int count=0;
        while(n != 0){
            rev = rev *10;
            digit =n %10;
            sum+=digit;
            rev+=digit;
            n=n/10;
            count++;
        }
        System.out.println(" Sum is "+ sum);
        System.out.println(" reverse is "+rev);
        System.out.println( count+" number");
    }
}
