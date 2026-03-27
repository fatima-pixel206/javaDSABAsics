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

}
