package If_Else.ArrayDSA;


public class OccurecneOfEverElement {
    public static void elementOcc(int[] ar) {
        for (int i = 0; i < ar.length/2; i++) {

            int occ = 1;

            for ( int j = ar.length-1; i < j; j--) {
                if (ar[i] == ar[j]) {
                    occ++;//1
                }
            }
            if(occ > 1){

                System.out.println(ar[i] + " " + occ + " times");

            }


            }


//
        }




    public static void main(String[] args) {
        int []ar={4,6,7,8,9,1,2,3,6,7,8,9,9,9,9};
        elementOcc(ar);
    }
}
