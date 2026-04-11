package If_Else.TwoDArray;

public class PrintDiagonal {
    public void printD(int[][]ar){
        if(ar.length== ar[0].length){
            for (int i = 0; i <ar.length ; i++) {
                for (int j = 0; j <ar[i].length ; j++) {
                    if((i==0 && j==0) || (i==0 && j==ar[i].length-1) ||(i==1 && j==1)|| (i==ar.length-1 && j==0)|| (i==ar.length-1 && j==ar[i].length-1))
                    {
                        System.out.print(ar[i][j]+"  ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrix is not perfect Square");
            System.out.println(" Last row or column will be ignored");
            for (int i = 0; i <ar.length ; i++) {
                for (int j = 0; j <ar[i].length ; j++) {
                    if((i==0 && j==0) || (i==0 && j==ar[i].length-1) ||(i==1 && j==1)|| (i==ar.length-1 && j==0)|| (i==ar.length-1 && j==ar[i].length-1))
                    {
                        System.out.print(ar[i][j]+"  ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void main() {
        int [][] ar={
                {1,3,4}   , {1,6,4}  ,  {8,3,5}

        };
        PrintDiagonal pd= new PrintDiagonal();
        pd.printD(ar);

    }
}
