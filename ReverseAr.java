package ArrayDSA;

public class ReverseAr {
    public static void main(String[] args) {
        int[]a ={9,1,8,2,6,3,6,7,11,2,90,78};
        MaximumOfArrayElements.DisplayOfArray(a);
        reverse3(a);
    }
    public static void reverse3(int[] args) {
        int n = args.length-1;
        int i = 0;
        int j = n ;
        while (i < j) {
            int tem = args[i];
            args[i] = args[j];
            args[j] = tem;
            i++;
            j--;
//        int i=2;
//        int j=5;
//        while(i<j){
//            int swap=args[i];
//            args[i]=args[j];
//            args[j]=swap;
//            i++;
//            j--;
        }
       MaximumOfArrayElements.DisplayOfArray(args);
        }

}
