package Chapter2;

import java.util.Scanner;

/*
calculating cost of daily driving of your car
dated 4,March 2026
 */
public class CarPoolSaving {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" calculating cost of daily driving of your car");
        System.out.println(" Please Enter total miles you driven per day");
        float perMiles= sc.nextFloat();
        System.out.println(" Enter cost per gallon of gasoline");
        int costGallon = sc.nextInt();
        System.out.println(" enter average miles per gallon ");
        float average = sc.nextFloat();
        System.out.println(" Enter parking fees per day ");
        int fees= sc.nextInt();
        System.out.println(" Tolls per day ???");
        int tolls = sc.nextInt();
        float gasCostPerDay= perMiles/average*costGallon;
        float dailyCost= gasCostPerDay+fees+tolls;
        float carPool = dailyCost/3;

        float benefit= dailyCost-carPool;
        System.out.println(" your daily cost is :"+dailyCost);
        System.out.println(" But if you share your car with three other persons");
        System.out.println("then your cost will be :"+carPool);
        System.out.println("You saved "+carPool+" per day");
    }
}
