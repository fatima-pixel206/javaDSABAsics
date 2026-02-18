package ArrayDSA;

import java.util.Scanner;

public class InputOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //        int [] array = { 3,4,6,9,0,4,2,0};// initialization of array
//        System.out.println(array.length);
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
        System.out.println(" Enter size ");
        int size= input.nextInt();
             int [] arr = new int[size];// declration
        // default valuse
//        for (int i = 0; i <7 ; i++) {
//            System.out.print(arr[i]+" ");// indexes will zero
//        }

        for (int i = 0; i <=size-1 ; i++) {
            System.out.println(" enter value " +i);
            int x=input.nextInt();
            arr[i]=x;
        }
       // int [] arr = new int[7];// declration
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]*2+" ");
        }
    }
}
