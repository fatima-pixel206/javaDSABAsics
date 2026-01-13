package ArrayDSA;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array ");
        int size = sc.nextInt();
        int[] era = new int [size];
        int sum = 0;
        int pro=1;
        for (int i = 0; i <size ; i++) {
            System.out.println(" Enter element number "+ i);
            era[i]=sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            sum = sum+era[i];
            pro = pro*era[i];
        }
//        for (int i = 0; i <size ; i++) {
//            pro = pro*era[i];
//        }
        System.out.println(" sum of all elements "+ sum);
        System.out.println(" product of all elements "+ pro);
    }
}
