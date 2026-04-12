package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first no: ");
        int a= sc.nextInt();System.out.println("Enter  second no: ");
        int b= sc.nextInt();
        System.out.println(" Calculate any one of the \n + - / * % ");
        System.out.println(" Enter a operator ");
        char c = sc.next().charAt(0);
        if(c=='+'){
            System.out.println(a+" + "+b+" = "+(a+b));
        }
                else if(c=='-'){
            System.out.println(a+" - "+b+" = "+(a-b));
        }
               else if(c=='*'){
            System.out.println(a+" * "+b+" = "+(a*b));
        }
                if(c=='/'){
            System.out.println(a+" / "+b+" = "+(a/b));
        }
                if(c=='%'){
            System.out.println(a+" % "+b+" = "+(a%b));
        }

    }
}
