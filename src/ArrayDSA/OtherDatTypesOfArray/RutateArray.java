package ArrayDSA.OtherDatTypesOfArray;

import ArrayDSA.MaximumOfArrayElements;


public class RutateArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 8, 7, 5, 3, 1, 0, 2};
//5 4 3 8 7 5 3 1 0 2
        specificindexreverse(a,0,2);
MaximumOfArrayElements.DisplayOfArray(a);
      //  int i = 0;
//        int j = 2;
//        while (i < j) {
//            int swap = a[i];
//            a[i] = a[j];
//            a[j] = swap;
//            i++;
//            j--;
//        }
//        for (int y : a) {
//            System.out.print(y + " ");
//        }
        System.out.println();
//        }
//        System.out.println();
//        int o = 7;
//        int p = a.length - 1;
//        while (o < p) {
//
//            int swap = a[o];
//            a[o] = a[p];
//            a[p] = swap;
//            o++;
//            p--;
//        }
         //   MaximumOfArrayElements.DisplayOfArray(a);


            specificindexreverse(a,7,a.length-1);
            MaximumOfArrayElements.DisplayOfArray(a);
            rotate(a,3);
        MaximumOfArrayElements.DisplayOfArray(a);

    }

    public static void specificindexreverse(int[] ar,int indF,int indT) {
      int i=indF;
      int j=indT;
      while(i<j){
          int tem=ar[i];
          ar[i]=ar[j];
          ar[j]=tem;
          i++;
          j--;



        }


    }
    public static void rotate(int[] ar,int rotate) {
        int i=0;
        while(i<rotate){
            int swap=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=swap;
            i++;
        }
    }

}