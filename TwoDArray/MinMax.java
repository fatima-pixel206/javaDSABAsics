package If_Else.TwoDArray;

public class MinMax {
    static void main() {
        int[][] ar= {
                {1, 4, 5}, {7, 9, 4}, {67, 34, 2}
        };
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(ar[i][j]> max){
                    max =ar[i][j];
                }
                 if(ar[i][j]< min){
                    min=ar[i][j];
                }
            }
        }
        System.out.println(" max "+ max);
        System.out.println(" min "+ min);

    }
}
