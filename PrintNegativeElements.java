package ArrayDSA;

import java.util.Scanner;

public class PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array : ");
        int size = sc.nextInt();
        int[] array= new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println(" Enter value of element number " + i);
            array[i]= sc.nextInt();

        }
        for (int i = 0; i <array.length ; i++) {


        if(array[i]<= -1){
            System.out.print(array[i]+" ");
        }
//        else{
//            System.out.println(" array have not any negative number");
      }
    }
}
