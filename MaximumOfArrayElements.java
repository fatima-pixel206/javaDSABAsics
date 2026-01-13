package ArrayDSA;

import java.util.Scanner;

public class MaximumOfArrayElements {
    public static int maximumOfElement(int[] arr){
        int max=arr[0];
//        if(arr.length==0){
//            return 0;
//        }
        for (int i = 0; i <arr.length ; i++) {

        if( arr[i] > max){
            max=arr[i];
        }
        }
        System.out.println(" maximum of array "+max);
        return max;
    }
    public static int[] inputOfArray( ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Size of array");
        int size = sc.nextInt();
    int[] array=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" enter value of element number "+ i);
            array[i]=sc.nextInt();
        }
        return array;
    }

            public static void DisplayOfArray(int []array){
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+" ");

                }
                System.out.println();
            }

    public static void DisplayOfArraychar(char []array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] myarray = inputOfArray();
       // inputOfArray();
       // DisplayOfArray(myarray);
        System.out.println();
        System.out.println(maximumOfElement(myarray));
        DisplayOfArray(myarray);
    }
}
