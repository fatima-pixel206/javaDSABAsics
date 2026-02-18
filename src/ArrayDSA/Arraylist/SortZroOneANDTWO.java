package ArrayDSA.Arraylist;

import ArrayDSA.MaximumOfArrayElements;

public class SortZroOneANDTWO {
    public static void sort(int[] ar) {
        int n=ar.length-1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >=i ; j--) {
                if(ar[i]>ar[j]){
                    int swap=ar[i];
                    ar[i]=ar[j];
                    ar[j]=swap;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[]a={1,2,0,1,2,0};
        sort(a);
        MaximumOfArrayElements.DisplayOfArray(a);
    }
}
