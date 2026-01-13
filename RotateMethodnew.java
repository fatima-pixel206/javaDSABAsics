package ArrayDSA;

public class RotateMethodnew {
    public static void ruto(int[] args, int r) {

       int i=args.length-r;
       int j=args.length-1;
       while(i<j-1){
           int swap=args[i];
           args[i]=args[j];
           args[j]=swap;
           i++;
           j--;
       }
    }public static void rutoother(int[] args, int r) {
        int i=0;
        int j=args.length-r-1;
        while(i<j){
            int swap=args[i];
            args[i]=args[j];
            args[j]=swap;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[]ar={3,5,7,8,9,0,2,4,6,88,2};
        int r=6;
        int n=ar.length-1;
        r=r%n;
        System.out.println(r);
        ReverseAr.reverse3(ar);
        ruto(ar,r);
        MaximumOfArrayElements.DisplayOfArray(ar);
        rutoother(ar,r);
        MaximumOfArrayElements.DisplayOfArray(ar);

    }
}
