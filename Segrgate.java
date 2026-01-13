package ArrayDSA;

import javax.swing.plaf.IconUIResource;

public class Segrgate {
    public static void segrgate(int[] arr) {
        int numzero=0;
        int numone=0;
        for (int i : arr) {
            if(i==0){
                numzero++;
            }
            else {
                numone++;
            }
        }
        System.out.println("  zeors: "+numzero);
        System.out.println("  one: "+numone);




        for (int i = 0; i <arr.length ; i++) {
            if(i<numzero){
                arr[i]=0;

            }
            else {

                arr[i]=1;
            }
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }

    public static void main(String[] args) {
        int [] arr={1,1,1,1,1,1,0,0};
        segrgate(arr);

    }
}
