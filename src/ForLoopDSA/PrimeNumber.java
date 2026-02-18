package ForLoopDSA;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n");
        int n = sc.nextInt();
        System.out.println(Math.sqrt(n));

        prime(n);
        int x=0;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0) {
                x = 1;
                break;
            }
        }
        if(x==1) {
            System.out.println(" composite number");
        }

            if(x==0){
                System.out.println("prime");
    }

    }
    public static int prime(int a){
        boolean flag= true;
        for (int i = 2; i <=a-1 ; i++) {
            if((a % i) == 0) {
                flag = false;
                break;
            }
        }
        if(flag==false) {
            System.out.println(" compositee number");
            return a;
        }

        if(flag==true){
            System.out.println("primee");
            return a;
        }

        return a;
    }
}
