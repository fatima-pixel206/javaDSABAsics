package Chapter2;

import java.util.Scanner;

/*
Body mass calculator
Dated 4,March 2026
 */
public class BMI {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print(" Enter your weight mass in Kilograms ");
       float weight = sc.nextFloat();
       System.out.print(" enter your height in meters ");
       float height = sc.nextFloat();

       float bmi= weight/height*height;
       System.out.println(" yor BMI is :"+bmi);
       if(bmi > 18.5){

           System.out.println(" underweight: "+bmi);
       }
       else if(bmi <= 24.9){
           System.out.println(" normal weight "+bmi);
       }
       else if(bmi> 25.29){
           System.out.println("overweight"+bmi);
       }
       else{
           System.out.println("obese");
       }
   }

}
