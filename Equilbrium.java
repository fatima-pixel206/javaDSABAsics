package ArrayDSA.Task;

public class Equilbrium {
    public static void equilbrium(int[] ar) {
        int rsum=0;
        int lsum=0;
        int s = ar.length/2;
        for (int i = 0; i <s ; i++) {
        rsum+=ar[i];
        }
        for (int i = s; i<ar.length ; i++) {
            lsum+=ar[i];
        }
        if(rsum==lsum){
            System.out.println("rihgt "+ rsum+" left "+lsum+" "+" array is balnced ");
        }
        else{
            System.out.println("rihgt "+ rsum+" left "+lsum+" "+" array is not balnced ");        }

    }

    public static void main(String[] args) {
        int []ar={2,8,4,1,1,2,3,9,0,1,2,3,4};
        equilbrium(ar);
    }
}