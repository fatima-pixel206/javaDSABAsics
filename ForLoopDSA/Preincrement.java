package If_Else.ForLoopDSA;

public class Preincrement {
    static void main() {
        int x=9;
        for (int i = 0; i <10 ; ++i) {
            x=i*++x;
            System.out.println(x);
            System.out.println(i);
        }
        System.out.println();

//        for (int i = 0; i <10 ; i+=1) {
//            System.out.print(i);
//
//        }
    }
}
