package PatternPrinting;

import java.util.Scanner;

public class PrintAlphaBetPattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a n ");
        int n= sc.nextInt();
        Pattern pat = new Pattern(n);

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                //if(i%2==1)
                System.out.print((char)(j+64) +" ");

            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(j+96) +" ");

            }
            System.out.println();
        }
    }
}
class Pattern{
    int n;
    Pattern(int n){
        this.n=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(i+96)+" ");

            }
            System.out.println();
        }
    }

}

