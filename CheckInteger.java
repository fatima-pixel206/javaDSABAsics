package If_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        double n = sc.nextDouble();
        if(n == (int)n){
            System.out.println(" int ");
        }
        else{
            System.out.println(" double");
        }
        int x=(int)n;
        if(n-x > 0){
            System.out.println(" not a integer");
        }
        else {
            System.out.println(" integer");
        }
    }
}