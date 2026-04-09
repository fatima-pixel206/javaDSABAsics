package If_Else.TwoDArray;

public class FindMaxAndMin
{
    public static void maxMin(int[][]ar){
        int max=ar[0][0];
        int min=ar[0][0];
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                if(ar[i][j]> max){
                    max=ar[i][j];
                }
                if(ar[i][j]< min){
                    min=ar[i][j];
                }
            }
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }

    static void main() {
        int [][] ar={
                {0,1,1,2,3},{4,5,6,7},{8,9,7,6,98}
        };
        maxMin(ar);
    }
}
