package If_Else.TwoDArray;




public class Reverse {
    static void main() {
        int[][] ar=new int[2][2];
        ar[0][0]=3;
        ar[0][1]=1;
        ar[1][0]=8;
        ar[1][1]=1;
        // Arrays.stream(ar).spliterator();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println(ar[i][j]);
            }
        }
    }
}
