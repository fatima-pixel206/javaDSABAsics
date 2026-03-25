package If_Else.ArrayDSA.Arraylist;



public class MoveZeroToRight {

    static void pushZerosToEnd(int[] arr) {
        // code here

        int swap;



        for(
                int i = 1, j = arr.length - 1;i<j;i++) {

            if (arr[j] != 0) {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;

            }
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
    static void main() {
        int[] ar={3,5,0,0,4};
        pushZerosToEnd(ar);
        System.out.println();
        for(int ele: ar){
            System.out.print(ele+" ");
        }
    }
}

