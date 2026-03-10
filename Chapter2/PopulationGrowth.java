package Chapter2;

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Current population");
        double cPopulation = sc.nextDouble();
        System.out.println("Annual growth rate");
        float growthR= sc.nextFloat();


        for (int i=1; i<=5;i++)
        {
            cPopulation=cPopulation*(1+growthR);
            System.out.println("Year"+i+":  "+Math.round(cPopulation));
        }
    }

}
