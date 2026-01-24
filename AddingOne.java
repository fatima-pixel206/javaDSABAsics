package ArrayDSA.Arraylist;
import ArrayDSA.MaximumOfArrayElements;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
     static ArrayList<Integer> addOne(int[] ar){
        ArrayList<Integer> ans= new ArrayList<>();
        int n=ar.length;
        int carry=1;
        for (int i = n-1; i >=0 ; i--) {
            if(carry+ar[i]<=9){
                ans.add(carry+ar[i]);
                carry=0;
            }
            else{
                ans.add(0);
                carry=1;
            }

        }
        if(carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
         System.out.print(ans+" ");
         return ans;
    }

    public static void main(String[] args) {
        int [] ar= {9,9};
        addOne(ar);
    }
}
