package If_Else.TwoDArray;

public class Square {
    static void main() {
        char[][] ar = new char[4][6];
        int n=  ar.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(i<n)ar[i][j]='*';

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

