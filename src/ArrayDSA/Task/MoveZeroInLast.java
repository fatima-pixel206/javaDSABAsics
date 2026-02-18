package ArrayDSA.Task;

import ArrayDSA.MaximumOfArrayElements;


public class MoveZeroInLast {
    public static void moveZero(int[] ar ) {
        int n=ar.length;
        for (int k = 0; k <ar.length ; k++) {
            for (int l = k; l <ar.length ; l++) {
                if(ar[k]==0){
                    int swap= ar[k];
                  ar[k]=ar[l];
                  ar[l]=swap;
                }
            }
        }

        }
    public static void main(String[] args) {
        int []arr={0,1,0,3,1,0,6,0};
        MaximumOfArrayElements.DisplayOfArray(arr);

        moveZero(arr);
        MaximumOfArrayElements.DisplayOfArray(arr);
    }
}
