package If_Else;
import java.util.Scanner;
public class MagnitudeOf69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n= sc.nextInt();
        if( n < -1) {


            n = -n;
        }
        if( n < 69 ){
            System.out.println(n);
            System.out.println(" yess ");
        }
        else System.out.println(" enter a number less then 69");
    }
}
