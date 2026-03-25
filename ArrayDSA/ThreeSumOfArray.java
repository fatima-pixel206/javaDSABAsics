package If_Else.ArrayDSA;

import java.util.Arrays;

public class ThreeSumOfArray {
    public static void threeSum(int[] arr,int target){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-2 ; i++) {
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
            if ((arr[i] + arr[left] + arr[right]) == target) {
                System.out.println(arr[i]+" "+arr[left]+" "+arr[right]+"="+target);
                left++;
                right--;
            }
            else if ((arr[i]+arr[left] + arr[right]) < target) {
                left++;
            }
            else if ((arr[i]+arr[left] + arr[right] )> target) {
                right--;
            }
        }
    }
}

    static void main() {
        threeSum(new int[]{-1,0,1,2,-1,-4},3);
    }
}
