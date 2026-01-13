package ArrayDSA;

import java.util.Arrays;

public class SortArrayBuiltin {
    public static void main(String[] args) {
        //sort means accending or decinding order
        int[] arr = {5, 3, -9, 44, -9, 2, 33, 111, 740, 3, 1, 22, -7};
        MaximumOfArrayElements.DisplayOfArray(arr);
        Arrays.sort(arr);
        MaximumOfArrayElements.DisplayOfArray(arr);
        char[] ar = {'b', 't', 'x', 'y', 'l', 'z', 'o', 'p', 'a', 'c', 'd', 'i', 'l', 'w', 'r', 'k', 'n', 'e', 'u', 'f', 'v', 'g',};
        //  MaximumOfArrayElements.DisplayOfArray();
        MaximumOfArrayElements.DisplayOfArraychar(ar);
        Arrays.sort(ar);
        MaximumOfArrayElements.DisplayOfArraychar(ar);

    }
}