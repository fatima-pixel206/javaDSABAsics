package Chapter2;

import If_Else.FindTriangle;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Dated 9,March 2026
implemanting some oprations on array
 */
public class lab1_28 {
    // 1: reading
    public static void readingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // 2: taking input from user INSERTION ;

    public static void inputInsertion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter size of array ");
        int size = scanner.nextInt();
        // defining array
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" Enter value on index :" + i);
            ar[i] = scanner.nextInt();
        }
    }

    // deleting
    public static void deleting(int ind, int[] arr) {
//        int[] newArray = new int[arr.length - 1];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (i != ind) {
//                newArray[j++] = arr[i];
//                // creating a new array and transfer values except positon giving
//
//            }
//            // or simplyیی و
//            arr[ind] = 0;  // it is more time and, space saving
//
//        }
        arr[ind] = 0;
    }

    // splitting
    public static void splitting(int[] ar, int indFrm, int indTo) {
        int[] indF = new int[indFrm];
        int[] indT = new int[ar.length - indFrm - 1];
        for (int i = 0; i < indFrm; i++) {
            indF[i] = ar[i];
        }

        for (int i = 0; i < indT.length; i++) {
            indT[i] = ar[i + indFrm];
        }
//       for (int i = 0; i < ar.length ; i++) {
//            if(i <= indFrm){
//                indF[i]=ar[i];
//            }
//            if(i>=indFrm  && i< indT.length) {
//                indT[i]=ar[i];
//            }
//        }

        for (int ele : indF) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : indT) {
            System.out.print(ele + " ");
        }
    }

    //merging
    public static int[] merging(int[] ar, int[] br) {
        int[] merged = new int[ar.length + br.length];
//        for (int i = 0,k=0;i < ar.length ; i++) {
//
//            merged[i] = ar[i];
//        }
//        for (int i = ar.length, k=0;  i <merged.length ; i++) {
//                merged[i]=br[k];
//                k++;
//        }
        for (int i = 0, k = 0; i < merged.length; i++) {
            if (i < ar.length) {
                merged[i] = ar[i];
            } else {
                merged[i] = br[k++];

            }
        }
        for (int ele : merged) {
            System.out.print(ele + " ");
        }
        return merged;
    }

    static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
//        int indF=3;
//        int indt=4;
//        splitting(arr,indF,indt);
        int[] br = {2, 3, 4, 5, 7};
       // merging(arr, br);
        //reversing(arr);
       // copy(arr);
       // readingArray(arr);
        int []ar={9,8,5,3,6,2};
       // sorting(ar); working on it..........
    }

    // searching
    public static void searching(int[] ar, int srch) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == srch) {
                System.out.println(srch + "is in array, index is  " + i);
            } else {
                System.out.println("Not in array");
            }
        }

    }
    // reverse
    public static void reversing(int[]ar){
        int j=ar.length-1;
        int swap;
        for (int i = 0; i < ar.length/2; i++) {
            swap=ar[i];
            ar[i]=ar[j];
            ar[j]=swap;
            j--;
        }
    }//
    // coping
    public static void copy(int[] ar){
        int[] copied = ar;
      //  System.out.println(copied[0]);
        readingArray(copied);
    }
    // sorting

//    public static void sorting(int[] ar) {
//        int swap;
//        for (int i = 1; i < ar.length - 1; i++) {
//            for (int j = 0; j < ar.length - 1 - i; j++) {
//
//
//                if (ar[j] > ar[j+1]) {
//                 swap=ar[j];
//                 ar[j]=ar[j+1];
//                 ar[j+1]=swap;
//
//                }
//            }
//        }
//        readingArray(ar);
//    }
}