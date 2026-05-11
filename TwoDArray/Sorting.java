package If_Else.TwoDArray;

import If_Else.ArrayDSA.Task.sorting;

public class Sorting {
     void sorting(int[][]ar){
         for (int i = 0; i < ar.length-1; i++) {
             for (int j = 0; j < ar[i].length-1; j++) {
                 for (int k = 0; k < ar.length-1; k++) {
                     for (int l = 0; l < ar[i].length-1; l++) {
                        if(ar[k][l]>ar[k][l+1]){
                            int swap=ar[k][l];
                            ar[k][l]=ar[k][l+1];
                            ar[k][l+1]=swap;
}
                     }
                 }
             }
         }
         for (int i = 0; i < ar.length; i++) {
             for (int j = 0; j < ar[i].length; j++) {
                 System.out.print(ar[i][j]+" ");
             }
             System.out.println();
         }
     }

     void main() {
         int[][] ar = {
                 {3,1,6},{1,9,8},{4,6,7}
         };

        sorting(ar);
    }

        void sorting2(int[][] ar) {
            // Single loop for each position in the entire 2D array
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    // Compare current element with ALL elements after it
                    for (int k = 0; k < ar.length; k++) {
                        for (int l = 0; l < ar[k].length; l++) {
                            // Compare: current element [i][j] with [k][l]
                            // But only compare if [k][l] comes after [i][j]
                            if ((k > i) || (k == i && l > j)) {
                                if (ar[i][j] > ar[k][l]) {
                                    // Swap them
                                    int temp = ar[i][j];
                                    ar[i][j] = ar[k][l];
                                    ar[k][l] = temp;
                                }
                            }
                        }
                    }
                }
            }

            // Print the sorted array
            System.out.println("Sorted Array:");
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Sorting sorter = new Sorting();
            int[][] ar = {
                    {3, 1, 6},
                    {1, 9, 8},
                    {4, 6, 7}
            };

            sorter.sorting2(ar);
        }
    }

