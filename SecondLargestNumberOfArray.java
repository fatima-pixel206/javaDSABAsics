package ArrayDSA;

public class SecondLargestNumberOfArray {
    public static void main(String[] args) {
        int[] arr = MaximumOfArrayElements.inputOfArray();
        int max = arr[0];
        int secLar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]> secLar && arr[j]< max){
                    secLar=arr[j];
                }
            }
        }
        System.out.println(" largest "+max);
        System.out.println("second largest "+secLar);

        MaximumOfArrayElements.DisplayOfArray(arr);
    }
}