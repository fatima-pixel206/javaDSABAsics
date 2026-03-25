package If_Else.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;



public class OperationsOnTwoDArray {
    public static void initialize(){
        int[] [] arr= inputOfTwoD();
        reverse(arr);
        Arrays.stream(arr).sorted();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
//        int value=8;
//        for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(arr[i][j]==value){
//                    arr[i][j]=0;
        // }

        //}

    }

    public static int[][] inputOfTwoD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter size of rows  :");
        int rows = scanner.nextInt();
        System.out.println("please enter size of columns ;");
        int column = scanner.nextInt();
        int[][] narray = new int[rows][column];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("please enter element of rows :" + (i + 1) + ", column : " + (j + 1) + " :");
                narray[i][j] = scanner.nextInt();

                j++;
            }
            i++;
        }


        return narray;

    }

    public static void main(String[] args) {
        // inputOfTwoD();
        int[] [] arr= inputOfTwoD();
        reverse(arr);
    }
    public static void update(int[][]qr,int value,int row,int column){
        qr[row][column]=value;

    }
    public static void copy(int[][]cop)
    {
        int[][] cp=cop;
        //cp.length();
        cp[0][1]=9;
        for (int i = 0; i <cp.length ; i++) {
            for (int j = 0; j <cop[i].length ; j++) {}
        }

    }
    public static void reverse(int[][]ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            int[] ints = ar[i];

        }
    }
    public static void read(int[][]ar){

    }
}



