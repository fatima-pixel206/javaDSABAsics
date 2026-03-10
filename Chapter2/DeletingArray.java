package Chapter2;

public class DeletingArray {
    static void main() {


        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != pos) {
                newArr[j++] = arr[i];
            }
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }

    }

        public static void main(String[] args) {
            main();
            int[] arr = {10, 20, 30, 40, 50};
            int n = arr.length;
            int pos = 2; // index jahan se delete karna hai (30)

            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

          //  System.out.println(arr.length);
            n = n - 1;

//            System.out.println("Array after deletion:");
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
        }
    }
