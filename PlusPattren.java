package PatternPrinting;

import java.util.Scanner;

public class PlusPattren
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" enter rows");
        int r = sc.nextInt();
//        System.out.println(" enter rows");
//        int cl = sc.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=r ; j++) {
                if(j==r/2+1 || i== r/2+1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
