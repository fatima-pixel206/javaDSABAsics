package If_Else.MultiDimensionalArrays;

public class ThreeDArrays {
    public static   void initialize(){
        int[][][] arr = {
                {
                        {1,2,3,4},{4,5,6,7},{7,8,9,10}
                },
                {
                        {22,33,44},{45,23,12,45,90},{98,56,43,21,00}
                }
        };
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static void main() {
        initialize();
    }
}
