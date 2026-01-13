package If_Else;

import java.util.Scanner;

public class PerameterOfRectangle {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter  length of triangle");
            int L=sc.nextInt();
        System.out.println(" Enter a breath of triangle");
        int B=sc.nextInt();
        int p = 2*( L + B);
        System.out.println(" perameter of  Rectangle  is "+ p);

    }
}
