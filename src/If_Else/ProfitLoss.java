package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a the cost price ");


        double cost = sc.nextDouble();
        System.out.println(" Enter a selling price ");
        double sell = sc.nextDouble();

        if(sell > cost ){

            double profit= sell-cost;
            double percentage= profit/cost * 100;
            System.out.println(" profit " + profit+ "\n  percentage "+ Math.round(percentage));
        }
        else if( cost > sell){

            double loss= cost-sell;
            System.out.println(" loss "+loss);
        }
        else if(cost == sell){

            System.out.println(" no profit no lost");
        }
        else{

            System.out.println(" enter valid price");
        }
    }
}