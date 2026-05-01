package If_Else.ArrayDSA;

public class MaxMin {
    static void main(String[] args) {
        int[]  ar = {5,-90,56};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] < min)
                min = ar[i];
            if(ar[i]> max)
                max = ar[i];
        }

        System.out.println(max);
        System.out.println(min);
    }
}
