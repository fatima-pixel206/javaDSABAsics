package ArrayDSA;
// date 11,1,2026

public class ForEachLoop {
    // specialyy used to traverse of data stractures
        // can not modiefy arry elements  not update
    public static void main(String[] args) {
        int[] farr=MaximumOfArrayElements.inputOfArray();
//        for (int i = 0; i < farr.length; i++) {
//            farr[i]=farr[i]+8;
//        }
//        for (int i = 0; i < farr.length; i++) {
//            System.out.println(farr[i]+" ");
//        }

//        for(int ele : farr){// element in the array
//            // ele can b any name it is variable
//            // it is copy of array each index is copied in variable
//            System.out.print(ele+2+" ");
//        }
        for(int i : farr){
            i=i*2;

        }
        for(int i : farr){

            System.out.print(i+" ");
        }
    }

}
