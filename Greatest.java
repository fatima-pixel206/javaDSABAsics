package If_Else;

import javax.swing.*;
import java.util.Scanner;

public class Greatest {
    public static void main( String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter  first number");
        int x= sc.nextInt();
        System.out.println(" Enter   second number");
        int y = sc.nextInt();
        System.out.println(" Enter   third number");
        int z = sc.nextInt();
            Nested NES= new Nested();
            NES.nested(x,y,z);
        if( x > y && x > z){
            System.out.println(x+ " greatest");
        }
        else{
            if(y > x &&  y > z){
                System.out.println(y+ " greatest");
            }
            else{
                System.out.println(z+" is greatest");
            }
        }
    }
}
class Nested {
    int nested(int x, int y, int z) {
        int greatest=0;
            if(x>y){
               if(x > z){
                   System.out.println(x);
                   greatest=x;
               }
               else{
                   System.out.println(z);
                   greatest=z;
               }
            }
            else if( y> x){
                if(y>z){
                    System.out.println(y);
                    greatest=y;
                }
                else {
                    System.out.println(z);
                    greatest=z;
                }
            }
            return greatest;
    }

}
