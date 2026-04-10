package If_Else.TwoDArray;

public class returnAfterDeletingEle {
    // first we should find no of occ
    public int noOfOCC(int[][]ar,int delete){
        int occ=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                if(ar[i][j]== delete){
                    occ++;
                }
            }
        }
        return occ;
    }
    // now delete the no
    public int[][] deleted(int[][]ar, int delete){
        int occ= noOfOCC(ar,delete);
    int row=ar.length;
    int col= ar[0].length;
    int [][] arr2= new int[row][col];


        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length-1 ; j++) {
                if(ar[i][j] == delete){
                    j++;
                }

                    arr2[i][j]=ar[i][j];

            }
        }
        return arr2;
    }

    static void main() {
        int [][] ar={
                {1,2,3},{4,5,6},{8,9,2}
        };

        OperationsOnTwoDArray.read(ar);
       returnAfterDeletingEle dp = new returnAfterDeletingEle();
        //System.out.println( dp.noOfOCC(ar,2));
        System.out.println();
        dp.deleted(ar,2);
      OperationsOnTwoDArray.read(ar);

    }
}
