package Chapter2;
/*
Dated 1,March,206
 */
import java.util.Scanner;

public class Arithmetic_SmallestAndLargest {


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number");
       int a= sc.nextInt();
       System.out.println("enter a number");
       int b= sc.nextInt();
       System.out.println("enter a number");
       int c= sc.nextInt();
       int sum=a+b+c;
       System.out.println("Sum: "+sum);
       int avg=(a+b+c)/3;
       System.out.println("Avg: "+avg);
       int pro=a*b*c;
       System.out.println("Pro: "+pro);

           if(a > b && a > c ){
               System.out.println(a+" Greater");
           }
           else if(b > a && b > c ){
               System.out.println(b+" Greater");
           }
           else{
               System.out.println(c+" Greater");

       }
   }



}
