package If_Else.TwoDArray;

public class Transpose {
    // convert rows into columns and columns int rwo
  //  approach 1
    void transpose1(int[][]ar)
    {
        int [][] transpose = new int[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                transpose [j][i]= ar[i][j];
                //move 0,1 elements to 1,0
                // 0,2 wil be at 2,0
            }
        }
        for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[i].length; j++) {
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
    }
            void transpose2(int [][] ar){
                for (int i = 0; i < ar.length; i++) {
                    for (int j = i+1; j < ar[i].length; j++) {
                        // without an extra array
                        // just swaping
                        int swap = ar[i][j]; // 0,1
                        ar[i][j]= ar[j][i];// shifting 1,0 on 0,1
                        ar[j][i] = swap;// shifting 0,1,on 1,0

                    }
                }
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar[i].length; j++) {
                        System.out.print(ar[i][j]+" ");
                    }
                    System.out.println();
                }
            }

    static void main(String[] args) {
        int[][] ar2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("current");
        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[i].length; j++) {
                System.out.print(ar2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose");
        // app 1
        Transpose transpose = new Transpose();
       // transpose.transpose1(ar2);
        transpose.transpose2(ar2);
//        for (int i = 0; i < ar2.length; i++) {
//            for (int j = 0; j < ar2[i].length; j++) {
//                System.out.print(ar2[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
