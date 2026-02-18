package Methods.Bultin;
import java.util.Scanner;

public class NCRAndNPR {
    public static int fact(int f){
        int z=1;
        for (int i = 1; i <=f ; i++) {
            z= z*i;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  first number");
        int N = sc.nextInt();
        System.out.println(" Enter   second number");
        int R = sc.nextInt();
        int NCR=fact(N)/(fact(R)*fact(N-R));
        int NPR=fact(N)/(fact(N-R));
        System.out.println(NCR);
        System.out.println(NPR);
//        int NFact= 1;
//        int RFact= 1;
//        int NR= 1;
//        int cpr=1;
//        for (int i = 1; i <=N ; i++) {
//            NFact= NFact*i;
//        }
//        for (int i = 1; i <=R ; i++) {
//            RFact= RFact*i;
//        }
//        for (int i = 1; i <=N-R ; i++) {
//         NR   = NR*i;
//        }
//        cpr=NFact/(RFact*NR);
//        System.out.println(cpr);
    }
}
