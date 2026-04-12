package If_Else.BasicOfDSA.Basictask;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year in numbers ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year+" leap year ");
        }
        else{
            System.out.println(year+" Not a leap year ");
        }
    }
}
