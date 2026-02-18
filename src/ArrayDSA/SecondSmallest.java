package ArrayDSA;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arri = MaximumOfArrayElements.inputOfArray();
        seclargest(arri);
//        int smin = seclargest(arri);
//        System.out.println(smin);
        MaximumOfArrayElements.DisplayOfArray(arri);
    }

    public static int seclargest(int[] arr) {
//        int sMin = arr[0];
//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < sMin && arr[j] > min) {
                sMin = arr[j];
            }
        }
        System.out.println(" Smallest num " + min);
        System.out.println("  second Smallest num " + sMin);
        return sMin;

    }
}