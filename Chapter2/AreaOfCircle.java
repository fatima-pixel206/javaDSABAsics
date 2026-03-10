package Chapter2;

import java.util.Scanner;

/*
2,March,2026
 */
public class AreaOfCircle {
  //  @Override
//    public String toString() {
//        return "AreaOfCircle{}";
//    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the radius of the circle diameter");
      int radius = input.nextInt();
      int diameter = radius*radius;
      System.out.println("The circle diameter is "+diameter);
    double circumference=2*Math.PI*diameter;
    System.out.println("The circumference is "+circumference);
 double area = 3.14*radius*radius;
 System.out.println("The area is "+area);
  }
}
