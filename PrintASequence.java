package ForLoopDSA;

import java.util.Scanner;

public class PrintASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
            //n=n-1;
            System.out.println(n--);
//

        }
    }
}
