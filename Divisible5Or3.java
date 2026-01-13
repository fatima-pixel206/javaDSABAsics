package If_Else;

import java.util.Scanner;

public class Divisible5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        int n =Math.abs(num);
        if( n % 5 == 0 && n % 3==0){
            System.out.println(" Divisible  by 5 and 3");
        }
        else if( n % 3 ==0){
            System.out.println(" Divisible  by 3");
        }
        else if( n % 5 == 0 ){
            System.out.println(" divided by  5  ");
        }
        else if( n % 3 !=0 && n % 5 !=0){
            System.out.println(" not  divided by both 5 and 3 ");

        }
        else {
            System.out.println(" check number ");
        }
    }
}