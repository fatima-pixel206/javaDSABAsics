package If_Else;

import java.util.Scanner;

public class FindQuadrant {
   public static void main( String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println(" Enter  value of x");
    int x= sc.nextInt();
    System.out.println(" Enter  value of y");
    int y = sc.nextInt();
    // origin
    if( x == 0 && y == 0){
        System.out.println(" origin ");

    }
    // q1
    else if( x > 0 && y > 0 ){
        System.out.println(" quadrant 1");
    }
    // quadrant 2
    else if ( x<=-1 && y > 0) {
        System.out.println(" quadrant 2");
    }
    // quadrant 3
    else if( x <= -1 && y <= -1 ){
        System.out.println(" quadrant 3");

    }
    // quadrant 4
       else if( x > 0 && y <=-1){
        System.out.println(" quadrant 4");
    }
       // x-axes
       else {
        if (y == 0) {
            System.out.println(" x- axes");
        }
        // y-axes
        else {
            System.out.println(" y axes");
        }
    }

   }
}