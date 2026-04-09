package If_Else.TwoDArray;

import java.util.Scanner;

public class SearchInTwoDArray {
    public void searchInTwoD(int[][]arr,int search){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(search==arr[i][j]){
                    System.out.println(search+" is in array on row "+i+" column 4" +
                            ""+j);
                }
            }
        }
    }

    static void main() {
        OperationsOnTwoDArray sp = new OperationsOnTwoDArray();
        // initialize
        int[][] arr = {
                {1,3,4}  ,{5,6,7},{5,3,28,9,6,22},{56,4,3,1}
        };
        sp.read(arr);
        Scanner sc = new Scanner(System.in);

        int[][] ar= sp.inputOfTwoD();
        System.out.println("Enter number to search ");
        int sr = sc.nextInt();
        SearchInTwoDArray st = new SearchInTwoDArray();
         st.searchInTwoD(ar,sr);
         sp.read(ar);
    }
}
