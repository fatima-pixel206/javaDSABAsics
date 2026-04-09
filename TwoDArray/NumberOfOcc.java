package If_Else.TwoDArray;

public class NumberOfOcc {
    public static void numOfOcc(int[][] ar){
        for (int i = 0; i <ar.length ; i++) {
            int occ=0;
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = ar[i].length; k < j; k++) {
                    if(ar[i][j] ==ar[j][k]){
                        occ++;
                    }
                }
                if(occ>1){
                    System.out.println(ar[i][j]+"is "+occ+" times");

                }

            }
        }
    }

    static void main() {
        int [][] ar={
                {1,2,3,7},{4,5,6,7},{8,9,7,6}
        };
        numOfOcc(ar);
    }
}
