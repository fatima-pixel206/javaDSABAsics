package SpaceAndTimeComlexity.TimeComplexity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOfArray {

    public static void swap(int[] arr){
        int temp;

//        for (int i = 0,j=arr.length-1; i < j; i++) {
//            temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            j--;
//        }
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    /*
    Here the time comp is also O(n/2)= O(n)
     */
    void main() {
        int[] arr= {2,4,5,6,7,8,91,0};
        swap(arr);
       // Arrays.toString(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
