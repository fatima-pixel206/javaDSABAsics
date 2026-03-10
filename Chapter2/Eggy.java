package Chapter2;

import java.util.Scanner;

public class Eggy {
    public static void main(String[] args) {
        System.out.println(" enter Number of rows :");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.println(" enter Number of columns :");
        int columns = input.nextInt();

        String up1="";
        String up2="";
        String down1="";
        String down2="";
            if(rows==5){
                up1="   ***  ";
                up2=" *      *";
                down1=" *      *";
                down2="   ***  ";
            }
            else{
                up1="   ***   ";
                up2=" *      *";
                down1=" *      *";
                down2="   ***    ";
            }
        System.out.println(up1);
        System.out.println(up2);
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=columns ; j++){
                if(j==1 || j==columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(down1);
        System.out.println(down2);
    }
}
