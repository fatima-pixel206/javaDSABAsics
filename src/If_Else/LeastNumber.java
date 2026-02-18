package If_Else;

import java.util.Scanner;

public class LeastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  first number");
        int x = sc.nextInt();
        System.out.println(" Enter   second number");
        int y = sc.nextInt();
        System.out.println(" Enter   third number");
        int z = sc.nextInt();
        if(x <= y){
            if( x <= z){
                System.out.println(" least number is "+ x);
            }
            else {
                System.out.println(" least number is "+ z);

            }

        }
        else{
            if( y < x){
                if(y <= z){
                    System.out.println(" least number is "+ y);
                }
                else{
                    System.out.println(" least number is "+ z);
                }
            }

        }
    }
}