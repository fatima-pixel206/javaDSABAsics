package SpaceAndTimeComlexity.TimeComplexity;
/*
Dated 13,March 2026
calculating time complexity
BigOofN
 */
public class CalculateTimeComplexity {
    // question one
    public static void case1(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println("java");
        }
       // O(n) is leaner time
        // here the time complexity is n times ,the operation will be n time
        // so O(n) is time com
    }
    //  // question two
    public static void case2(int n){
        for (int i = 1; i <=n ; i=+2) {
            System.out.println("java2");
            //O(n)
            //the loop will iterate n/2 times means half of n
            // total opr: are n/2
            // Time com is O(n/2)=O(n)
            //why?
            // it is approx because if the n is in 20k then loop will run 10k times
            // it is still is k so it is constant
        }
    }
    // // question three
    public static void case3(int n){
        for (int i = 1; i <=n-7 ; i++) {
            System.out.println("Java");

        }
        /* operation will run n-7 times if n is 10 then loop will run 3 times
        time com is O(n-7) = O(n)
        because if some constant is added or subtracted or multiplied it will remain same

        time com is not measured on constant number like 3,5,7
         */

    }
    // question four
    public static void case4(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println("java");
        }
        for (int i = 1; i <=n; i++) {


            System.out.println();
        }
        /*
        time com will 2n because there are 2 loops with same no:of operations
        O(2n)=O(n)
         */
    }
    // question five
    public static void case5(int n,int m){
        for (int i = 1; i <=n ; i++) {
            System.out.println("java");
        }
        for (int i = 1; i <=m ; i++) {
            System.out.println("java");
        }
        /*
        here the time com is O(n+m)
        because we do not know the value if both variables and the total no of op
        are n+m
        if n~=m O(m) or O(n)
        if n<m
        O(m)
        if m<n
        O(n)
         */
    }
    // question 6
    public static void case6(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println("java");
        }
        /*
        time comp is O(100)
        O(100)=O(1)
        or it is called constant time
        if there is no variable then it  is must there is constant num
        constant number=O(1)
        like
        O(45n)=O(n)
         */
    }
}
