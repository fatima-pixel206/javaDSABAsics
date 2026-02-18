package ArrayDSA;

public class OccurecneOfEverElement {
    public static void elementocc(int[] ar) {
        int occ = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > 0 && ar[i] == ar[i - 1]){
                continue;
        }
            occ = 0;

            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    occ++;//1
                }
            }
                System.out.println(ar[i] + " " + occ + " times");


        }
    }

    public static void main(String[] args) {
        int []ar={4,6,7,8,9,1,2,3,4,6,7,8,9};
        elementocc(ar);
    }
}
