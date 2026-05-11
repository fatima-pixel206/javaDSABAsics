package If_Else.TwoDArray;

public class Triangle {
    void triangle(char [][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if(j<=i){
                    ar[i][j]='*';
                }
                else ar[i][j]=' ';
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void main() {
        Triangle tri = new Triangle();
        char[][] ar = new char[4][4];
        tri.triangle(ar);
        tri.rightTriangle(ar);
    }
    void rightTriangle(char[][]ar){
        int n= ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n ; j++) {
                if(j<n-1-i)
                ar[i][j]='-';
                else {
                    ar[i][j]='*';
                }
            }

        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
