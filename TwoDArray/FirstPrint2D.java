package If_Else.TwoDArray;

public class FirstPrint2D {
    public static void main(String[] args) {
        int r=3;
        int col=3;
        int[][] twoD= new int[r][col];
        twoD[0][0]=1;
        twoD[0][1]=2;
        twoD[0][2]=3;
        twoD[1][0]=4;
        twoD[1][1]=5;
        twoD[1][2]=6;
        twoD[2][0]=7;
        twoD[2][1]=8;
        twoD[2][2]=9;
        // System.out.println(twoD.length);
        int[] arr =new int[twoD.length*twoD.length];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;

        int cc=9;
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <col; j++) {

                if(twoD[i][j]==cc){
                    System.out.println(twoD[i][j]);
                    System.out.println(cc);
                }
            }

        }
//       if(twoD[2][2]==arr[2])
//       {
//           System.out.println("u");
//       }
        // System.out.println(cc);
        // System.out.println(twoD.length==arr.length);
    }


}
