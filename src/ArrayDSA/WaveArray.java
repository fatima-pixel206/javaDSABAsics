package ArrayDSA;

public class WaveArray {
    public static void makeWave(int[] ar) {
        int i = 0;
        int j = 1;
        while (i < ar.length-1) {
            if (ar[i] < ar[j]) {
                int swap = ar[i];
                ar[i] = ar[j];
                ar[j] = swap;
            }
            i += 2;
            j += 2;
        }
    }
        public static void wavearray(int[] ar) {
            for(int i = 0; i <ar.length-1 ; i+=2) {
//                if(i==ar.length-1){
//                    break;
//                }
                    int swap=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=swap;
            }
        }


    public static void main(String[] args) {
        int[] ar = {20, 30, 40, 50, 60, 70,80,};
        wavearray(ar);
        MaximumOfArrayElements.DisplayOfArray(ar);
    }
    }


