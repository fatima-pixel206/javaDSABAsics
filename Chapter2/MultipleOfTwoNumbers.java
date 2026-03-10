package Chapter2;

import java.util.Scanner;

public class MultipleOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int n1 = input.nextInt();
        System.out.println("Please enter the second number:");
        int n2 = input.nextInt();
        multipleOfTwo(n1,n2);
    }
    public static void multipleOfTwo(int a,int b){
        if(a%b==0){
            System.out.println(a+" is multiple of "+b);
        }
        else if(b%a==0){
            System.out.println(b+" is multiple of "+a);
        }
        else{
            System.out.println(a+" is not multiple of "+b);
        }

    }
}
