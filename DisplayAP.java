package ForLoopDSA;

import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print(" enter n");
                int n=sc.nextInt() ;
        for(int i=2;  i<=3*n-1; i=i+3){

            System.out.println(i);
        }
                 //or
        System.out.println(" Enter starting point");
        int a=sc.nextInt();
        System.out.println(" Enter difference");
        int d=sc.nextInt();


        for (int i = 1; i <=n ; i++) {
            System.out.print(a+" ");
            a=a+d;
        }

    }




}
