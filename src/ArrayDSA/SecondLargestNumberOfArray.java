package ArrayDSA;

public class SecondLargestNumberOfArray {
    public static void main(String[] args) {
        int[] arr = MaximumOfArrayElements.inputOfArray();
        int max = -1;
        int secLar = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
                secLar=max;
                System.out.println(secLar);
            }
               else if(arr[i]< secLar && arr[i]!=max){
                    secLar=arr[i];
                }
            }

        System.out.println(" largest "+max);
        System.out.println("second largest "+secLar);

        MaximumOfArrayElements.DisplayOfArray(arr);
    }
}