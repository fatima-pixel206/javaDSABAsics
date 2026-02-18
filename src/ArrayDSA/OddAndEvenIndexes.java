package ArrayDSA;

public class OddAndEvenIndexes {
    public static void main(String[] args) {
      int[] arry= MaximumOfArrayElements.inputOfArray();
        MaximumOfArrayElements.DisplayOfArray(arry);
        for (int i = 0; i <= arry.length-1 ; i++) {
           if(i%2==1) {
             arry[i]=  arry[i]*2;
               System.out.print(arry[i]+"  ");
           }
           else {
               arry[i]=  arry[i]+10;
               System.out.print(arry[i]+" ");
           }
        }
        System.out.println();
         //MaximumOfArrayElements.DisplayOfArray(arry);
    }
}
