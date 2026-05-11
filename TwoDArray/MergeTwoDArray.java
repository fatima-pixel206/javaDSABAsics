package If_Else.TwoDArray;

public class MergeTwoDArray {
   static void main(String[] args){
       int[][] ar1 ={{1,2,3,},{4,5,6,}};
       int[][] ar2 ={{7,8,9},{10,5,6,}};
        int [][]merged = new int[ar1.length+ ar2.length][ar1[0].length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length ; j++) {
                merged[i][j]= ar1[i][j];
            }
        }
        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j <ar2[i].length ; j++) {
                merged[ar1.length+i][j]= ar2[i][j];
            }
        }
        System.out.println(merged.length);
       for (int i = 0; i < merged.length; i++) {
           for (int j = 0; j < merged[i].length; j++) {
               System.out.print(merged[i][j]+" ");
           }
           System.out.println();
       }
    }

     void main() {

        int[][] ar1 ={{1,2,3,},{4,5,6,}};
        int[][] ar2 ={{7,8,9},{10,5,6,}};

    }
}
