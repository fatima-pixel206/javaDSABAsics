package If_Else.TwoDArray;
// reverse rows position

public class ReverseTwOD {
    public static void reverse(int[][]ar) {
        int i = 0;
        int j= ar.length-1;
        while(i<j){
            int [] swap = ar[i];
            ar[i] = ar[j];
            ar[j] = swap;
            i++;
            j--;
        }

    }
    // reverse all elements/ each row

    static void reversRowsE(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ,k = arr[i].length-1; j < arr[i].length/2 ; j++) {
                int swap = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = swap;
k--;
            }
        }
    }


    static void main(String[] args) {
        int[][] ar= {
                {1, 23, 6,64},
                {4, 5, 6,67},
                {47,8,23,90},
                {7,9,100,67}
        };
        reverse(ar);
        reversRowsE(ar);

        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
