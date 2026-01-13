package If_Else;
import java.util.Scanner;
public class FindTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter First side of triangle in an integer");
        int a = sc.nextInt();
        System.out.println(" Enter second side of triangle in an integer");
        int b = sc.nextInt();
        System.out.println(" Enter third side of triangle in an integer");
        int c = sc.nextInt();

        if( a + b > c &&  b + c > a &&  a+ c > b){
            System.out.println(" this is triangle");
        }

        else {
            System.out.println(" not a triangle");
        }

    }
}
