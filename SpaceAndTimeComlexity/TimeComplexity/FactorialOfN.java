package If_Else.SpaceAndTimeComlexity.TimeComplexity;

public class FactorialOfN {
    public static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
/*
time comp is O(n)
 */
    public static void square(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {


                System.out.println();
            }
        }
        /*
        the time comp: is n*n , square
        O(n*n)= quadratic time
         */
    }
    public static void nestedLOop(int n,int m,int o,int r) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                for (int k = 1; k <=o ; k++) {
                    for (int l = 1; l <=r ; l++) {
                        System.out.println("Fatima");

                    }
                    /*
                    time comp: is ((n*m)*o*p)
                    if the internal loop is not related to outer loop
                    but if all loop goes to n then the time com:
                    is n cube

                     */
                }

            }
        }
    }
    public static void relatedIterators(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println("hi");
            }
            /*
            No: of ops: 1+2+3+4.....n
         formula   n(n+1)/2 orr (n*n)+n/2
         here the inner loop is related to outer loop
         time com: is O(n sq+n)= O(n)
             */
        }
    }
    /*
    if i=1 and j=i+1

     */
    public static void indexI(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i+1; j <=n ; j++) {
                System.out.println();
            }
        }
        /*
        here the number of ops are n(n-1)/2
        time complexity is O(n*n)=O(n)
         */
    }
    public static void logCh(int n){
        for (int i = 1; i <=n ; i*=2) {
            System.out.println("hi");
        }
        /*

        Here the no of Op are 1+2+3+4....x
        1+2+4+8+16+32+ n/2 ,n
        so the time comp is
        O(log2n+1) O(log n)

         */
    }
    static void main() {
        int n=6;
        System.out.println(factorial(n));
    }
}
