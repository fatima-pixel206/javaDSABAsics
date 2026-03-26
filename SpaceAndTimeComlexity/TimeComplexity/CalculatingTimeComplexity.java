package If_Else.SpaceAndTimeComlexity.TimeComplexity;

/*
Dated 16,March 2026
25 March 2026
Note :
when loop is increasing or decreasing with +1 or -1 time complexity
will b O(n)

when loop is nested time complexity will be O(n*n)
and when loop is increasing or decreasing with multiplying or dividing then
time comp is O(log n)


 */
public class CalculatingTimeComplexity {
    public  static void homeWork(int n){
        for (int i = -12; i <n+5 ; i+=3) {
            System.out.println("fatima");
            // time complexity is O(n)
            // this loop will run 8 times
        }
    }

    public void findTimeComplexityLog(int n){
        for (int i =n; i >=1 ; i/=2) {
            System.out.println("fatima");
        }
        /*
        Note whenever you see iteration is multiply or dividing
        as loop complete faster than n then  time complexity is O((log n))
        if n=16
        here total no of op: 4
        16,8,4,2,
        we can write n,n/2,..1
        n/2poewerk
        k = log2 n
        k is total no of steps or operations
        k=4
        log2 (16) is approx 4
        so time complexity is O(log 2 n)= O(log n)
        time com=O(log n)

         */
        }

    public void log(int n){
        for (int i = 0; i <=n ; i*=3) {
            System.out.println("hi");

        }
        /*
    if n=16
    2 + 6+. .n
    no of op 1, 2
        USING GP
            ar power x-1=n
            a=2 r=3
            (2)(3) power x-1=n
            apply log b s
         formula   2*3pow k= log2+log3=k
            log3(2*3 pow x-1) =log3(n)
            log3(2) +log3(3 pow x-1)=log 3(n)
            log3(2)+x-1=log3n
            x= log3n -log3 2+1
            log3(n)
           time complexity is O(log3n)
           O(log n)

         */
    }
    static void main() {
        homeWork(10);

    }
}
