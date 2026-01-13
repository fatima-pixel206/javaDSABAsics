package ArrayDSA;

public class MissingElementOFarray {
    public static void main(String[] args) {
        int []ar={12,10,9,8,7,5,6,2,1,4,3,13};
        System.out.println(ar.length);
        System.out.println( missing(ar)+" ");
    }
    public static int missing(int[] ar) {
        long n = ar.length+1;// length is liye zayada q ka ek miss hai
        long sum=0;
          n=n*(n+1)/2;
        for (int i : ar) {
         sum+=i;
        }
       // return Math.toIntExact( n - sum);
        return (int)(n- sum);
    }
}
