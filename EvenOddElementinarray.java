package ArrayDSA.Task;

public class EvenOddElementinarray {
    public static int evenOdd(int[] ar) {
        int even=0;
        int odd=0;
        for (int i = 0; i <ar.length ; i++) {
          if(ar[i]%2==0){
              even++;
          }
          else{
              odd++;
          }

        }
        System.out.print("even "+even+"\n");
        System.out.print("odd "+odd);
        return 0;
    }

    public static void main(String[] args) {
        int[]ar={3,5,6,7,9,2,44,8};
        evenOdd(ar);
    }
}
