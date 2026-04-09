package If_Else.TwoDArray;

public class CheckIsSorted {
    public boolean isTwoDSorted(int[][] ar) {
        boolean ans = false;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length - 1; j++) {
                if (ar[i][j] < ar[i][j + 1]) {
                    ans = true;

                } else {
                    ans = false;
                }

            }
        }
        return ans;
    }

    static void main() {
        CheckIsSorted chk= new CheckIsSorted();
        int [][] ar={
                {1,2,3},{4,5,6,7},{8,9,10,11}
        };
        System.out.println(chk.isTwoDSorted(ar));
    }
}