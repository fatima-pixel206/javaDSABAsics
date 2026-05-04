package If_Else.TwoDArray;

import org.w3c.dom.ls.LSOutput;

public class SumOfTWoD {
    static void main(String[] args) {
        int[][] ar= {
                {1, 23, 6},
                {4, 5, 6,},
                {47,8,23,}
        };
        int sum =0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum = sum + ar[i][j];

            }
        }
        System.out.println(sum);
    }

}
