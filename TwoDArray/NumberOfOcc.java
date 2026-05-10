package If_Else.TwoDArray;
/*
the time complexity is O(M)square
M=( r*c) square
rows =3
col =4
3*4

total no of op 120 approx
O(M)square
 */
public class NumberOfOcc {
    public static void numOfOcc(int[][] ar) {
        boolean[][] visitArray = new boolean[ar.length][ar[0].length];
        // this boolean array helps to print if a number is more then once time it will help to
        //print once time
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (visitArray[i][j]) {
                    i++;
                    j++;
                    continue;
                }
                int occ = 0;
                for (int x = 0; x < ar.length; x++) {
                    for (int y = 0; y < ar[x].length; y++) {

                        if (ar[i][j] == ar[x][y])
                        //!visitArray[i][j] = visitArray[i][j]==false
                        {
                            visitArray[x][y] = true;
                            occ++;
                        }
                        //end if
                    } //end y loop
                } //end x loop
                if (occ > 1)// this is visitArray == true
                {
//
//                }
                    System.out.println(ar[i][j] + " " + occ + " times");
                }

            }
        }

    }
    static void main() {
        int [][] ar={
                {1,2,3,7},{4,5,6,7},{8,9,7,6}
        };
        numOfOcc(ar);
    }
}
