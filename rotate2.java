package ArrayDSA;

import java.util.Scanner;

public class rotate2 {
    public static void reverseSpecificIndex(int[] arr, int indf, int indTo) {
        //{4,6,7,8,8,9,0,4,3,2,}
        int i = indf;
        int j = indTo;
        while (i < j) {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
    }

    public static void rotate(int[] ar, int r) {
        int i = 0;

        while (i < r) {
            int swap = ar[i];
            ar[i] = ar[(ar.length - 1) - i];
            ar[(ar.length - 1) - i] = swap;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = MaximumOfArrayElements.inputOfArray();
        MaximumOfArrayElements.DisplayOfArray(array);
        System.out.println(" Enter  index number you want to rotate from ");
        int indF = sc.nextInt();
        System.out.println(" Enter  index number you want to rotate  to");
        int indto = sc.nextInt();
//        System.out.println(" Enter last index number you want to rotate from ");
//        int indLT = sc.nextInt();
//        System.out.println(" Enter   last index number you want to rotate  to");
//        int indLF = sc.nextInt();
//
        System.out.println(" Enter  index number you want to rotate ");
        int r = sc.nextInt();

        reverseSpecificIndex(array, indF, indto);
        MaximumOfArrayElements.DisplayOfArray(array);

        reverseSpecificIndex(array, array.length-r, array.length-1);
        MaximumOfArrayElements.DisplayOfArray(array);
        rotate(array,r);
        MaximumOfArrayElements.DisplayOfArray(array);

    }
}