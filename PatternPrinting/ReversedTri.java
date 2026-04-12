package If_Else.PatternPrinting;

public class ReversedTri {
    static void revers(int n) {
        int a=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=a ; j++) {
                System.out.print(" * ");
            }
            a--;
            System.out.println();
        }

    }

    static void main() {
        revers(4);
    }
}
