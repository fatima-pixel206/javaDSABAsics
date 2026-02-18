package ArrayDSA;

public class AgainRotate {
    public static void rotate(int[] ar,int stat,int end) {
//stat=stat%ar.length;
        while(stat<end) {
            int swap=ar[stat];
            ar[stat]=ar[end];
            ar[end]=swap;
            stat++;
            end--;
        }
    }
    public static void rotatARR(int[] ar,int d) {
        int n=ar.length;
            d=d%n;
        rotate(ar,0,d-1);
        rotate(ar,d,n-1);
        rotate(ar,0,n-1);

    }

    public static void main(String[] args) {
        int []ar={1,2,3,4};
        rotatARR(ar,1);
        MaximumOfArrayElements.DisplayOfArray(ar);
    }
}
