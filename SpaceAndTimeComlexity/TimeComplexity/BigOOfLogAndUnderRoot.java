package If_Else.SpaceAndTimeComlexity.TimeComplexity;

public class BigOOfLogAndUnderRoot {
    public static  void case2(int n){
        for (int i = 1; i <=n ; i+=i) {
            System.out.println(i);
        }
        /*
        i= 1+2+4+8+...n .  n/2 +n
        no of op : 4 if n=16
        GP
        ar pow x-1=n
        a=1; r=2
        1(2)p x-1=n
        2x-1=n
        apply log
        log 2 (n)+1=x
        O(log 2 n+1)
        0(log n)

         */
    }
    public static void case3Nested(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j*=2) {
                System.out.println(j*i);

            }
        }
        /*
        time comp of outer loop is O(n)
        and inner loop is O(log2 n)
        applying GP ar pow x-1 =n
        n*log2 n
        time complexity is O(n(log n))
         */
    }
 public void case4Root(int n){
     for (int i = 1; i*i <=n ; i++) {
         System.out.println(i);
     }
     /*
 i*i <=n
 √i*i=√n
 i<=√n
  time complexity O(√n)
  */
 }
         public void case5(int n) {


             for (int i=2; i <=n ; i*=2) {
                 System.out.println(i);
             }
             /*
             no of terms are 2+4+8+16....
             2 power 2power k
             2 power k = log 2(n)
             k= log 2(log 2 n)
             time complexity is O(log(log(n)))
              */
         }
         public void case6(int n) {
        for (int i=2; i <=n ; i*=2) {
            for (int j = 1; j <=i ; j++) {

            }

        }
        /*
        outer loop time complexity is O(log n)
        and inner time complexity is O(n)
        no of terms of inner loop are
        1+2+4+8......n

        x=       no of terms
        sum of GP
        a(r power x -1)/r-1=n
        a=1 r=2
        2 power x-1=n
        x = log2 n+1
        2 power x=n
        2n-1
        O(2n)
        time complexity is O(n)
         */

         }
}
