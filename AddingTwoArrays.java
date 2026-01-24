package ArrayDSA.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AddingTwoArrays {
    public static ArrayList<Integer> addingTwo(int[] ar1, int[] ar2) {
        ArrayList<Integer> ans= new ArrayList<>();
        int i=ar1.length-1;
        int j=ar2.length-1;
        int carry=0;


            while(i>=0 || j>=0 || carry >0){
                int sum=carry;
                if(i>=0){
                    sum=sum+ar1[i];
                    i--;
                }


                if(j>=0){
                    sum+=ar2[j];
                    j--;
                }
                ans.add(sum%10);
                carry=sum/10;
                }


        Collections.reverse(ans);
        System.out.print(ans+" ");
            return ans;
    }

    public static void main(String[] args) {
        int[] ar1={3,4,5,6,7,8,9};
        int []ar2={3,5,6,22};
        addingTwo(ar1,ar2);
    }
}
