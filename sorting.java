package ArrayDSA.Task;

import ArrayDSA.MaximumOfArrayElements;

public class sorting {
    public static boolean sort(int[] ar) {
        int n=ar.length;
        boolean sort=false;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 1; j < ar.length; j++) {


                if (ar[i] < ar[j]) {
                    sort = true;
                }
else{
    sort=false;
                }
            }
        }
        if(sort){
            System.out.print(" sorted ");
        }
        else {
            System.out.print(" not sorted ");
        }
        return sort;
    }
    public static void main(String[] args) {
        int [] ar={3,4,5,6,7,8,9,1};
        System.out.println(  sort(ar));
        MaximumOfArrayElements.DisplayOfArray(ar);
    }
}
