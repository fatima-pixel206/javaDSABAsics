package If_Else.Ternary_Oprator;

import java.util.Scanner;

import static java.lang.System.in;

public class InputOfTwoDArray {
    public int[][] inputOfArray(){
        Scanner sc = new Scanner(in);
        System.out.println("Enter number of rows :");
       int rows = sc.nextInt();
        System.out.println("Enter number of columns :");
        int col = sc.nextInt();
        int [][] twoD= new int[rows][col];
        for (int i = 0; i <twoD.length ; i++) {
            for (int j = 0; j < twoD[i].length ; j++) {
                System.out.println(" Enter value on row "+ i+" column "+j);
                twoD[i][j]=sc.nextInt();

            }
        }
        return twoD;
    }
            public void printTwoD(int[][] ar){
                for (int i = 0; i <ar.length ; i++) {
                    for (int j = 0; j <ar[i].length ; j++) {
                        System.out.print(ar[i][j]+" ");

                    }
                    System.out.println();
                }
            }
    static void main(String[] args) {
        InputOfTwoDArray sp = new InputOfTwoDArray();
        int[][] arr= sp.inputOfArray();
        sp.printTwoD(arr);
    }
}
