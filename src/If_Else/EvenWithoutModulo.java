package If_Else;

import java.util.Scanner;

public class EvenWithoutModulo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n=sc.nextInt();
        if((n/2)*2==n){
            System.out.println(" Even");
        }
        else{
            System.out.println(" odd");
        }
    }
}
class Level2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int b=n/10;
        int digit=n-(10);
        System.out.println(digit);
        if(digit==0 || digit ==2 || digit==4 || digit==6 || digit==8 ){
            System.out.println(" Even");
        }
        else if(digit==1 || digit ==3 || digit==5 || digit==7 || digit==9 )
        {
            System.out.println("odd");
        }
    }

}
 class level3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter a number ");
         int n = sc.nextInt();
         for(int i=n; i>1;i++){
             n=n-2;
             if (n==1 || n ==3 || n==5 || n==7 || n==9 ){
                 System.out.println(" ODD");
                 break;
             }
             else if(n==0 || n ==2 || n==4 || n==6 || n==8){
                 System.out.println(" even");
                 break;
             }
         }
     }
 }
