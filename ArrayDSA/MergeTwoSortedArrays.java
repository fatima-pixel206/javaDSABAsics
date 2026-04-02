package If_Else.ArrayDSA;

public class MergeTwoSortedArrays {
    public void mergeSorted(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[a.length + b.length];
        while (j < a.length && k < b.length) {
            if (a[j] < b[k]) {
                merged[i++] = a[j++];
            } else {
                merged[i++] = b[k++];
            }
        }
        while (j < a.length) {
            merged[i++] = a[j++];
        }
        while (k < b.length) {
            merged[i++] = b[k++];
        }


        for (int ele : merged) {
            System.out.print(ele + " ");
        }

    }

    static void main() {
        MergeTwoSortedArrays mrg = new MergeTwoSortedArrays();
        mrg.mergeSorted(new int[]{1,3,6,9,10,19},new int[]{2,4,5,7,8,10});
    }
}
