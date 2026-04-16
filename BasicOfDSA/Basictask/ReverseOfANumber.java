package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class ReverseOfANumber {
    static void main() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number more then one digit ");
        int n = sc.nextInt();
        boolean isNegative=false;

        if(n<0){
            isNegative=true;
           n= Math.abs(n);
        }


int reverse=0;
        System.out.println("Initial "+n);

//        while(n>0){
//            int lastD=n%10;
//            reverse =reverse*10+lastD;
//            n=n/10;
//        }
        // with for
        for (int i = n; i >0 ; i=i/10) {
            int lastD=i%10;
            reverse =reverse*10+lastD;
        }
if(isNegative){
            reverse=-reverse;
    System.out.println("Reversed "+reverse);
}
else
        System.out.println("Reversed "+reverse);
    }
}
