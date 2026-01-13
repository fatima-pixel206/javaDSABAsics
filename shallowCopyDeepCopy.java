package ArrayDSA;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int [] arr={ 45,78,34,86,2,6,43,0};
        int[]x=arr;// x is shallow copy off arr
        // x he arr hai
        for (int i = 0; i <arr.length ; i++) {

        }
        System.out.println(arr[6]);
        x[6]=100;// change x me kiya magr haua arr me mtlb wo ek he hai
        System.out.println(arr[6]);
        int[] deep= Arrays.copyOf(arr,x.length);// same array
        deep[6]=98;
        System.out.println(arr[6]);
        System.out.println(deep[6]);// this is acutaly a diferent arry
       // deep
        int[] brr= new int[arr.length];
        for (int i = 0; i <x.length ; i++) {

        }
    }
}
