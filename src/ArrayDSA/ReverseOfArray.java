package ArrayDSA;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] ar = MaximumOfArrayElements.inputOfArray();
        MaximumOfArrayElements.DisplayOfArray(ar);
//        int i = 2;
//        int j = 5;
//        while (i < j) {
//            int tem = ar[i];
//            ar[i] = ar[j];
//            ar[j] = ar[tem];
//            i++;
//            j--;
//        }
        reverse3(ar);
        reverse4(ar);

        //MaximumOfArrayElements.DisplayOfArray(ar);
//        int n = ar.length;
//        int i=0;
//        int j= n-1;
//        for ( i = 0; i< ar.length ; i++) {
//         System.out.print(ar[j]+" ");
//            j--;
//        }
       // reverse4(ar);
    }

    // method 2
    public static void reverse(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[(n - i)];
            arr[(n - i)] = swap;
        }
        MaximumOfArrayElements.DisplayOfArray(arr);
    }

    // third methosd
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
        }
        for (int e : args) {
            System.out.print(e + " ");
        }
    }

    public static void reverse4(int[] args) {

        int i = 2;
        int j = 5;
        while (i < j) {
            int tem = args[i];
            args[i] = args[j];
            args[j] = args[tem];
            i++;
              j--;
        }
        MaximumOfArrayElements.DisplayOfArray(args);

    }
}