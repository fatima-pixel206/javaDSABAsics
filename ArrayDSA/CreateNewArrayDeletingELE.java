package If_Else.ArrayDSA;

import javax.sound.midi.Soundbank;

public class CreateNewArrayDeletingELE {

    public int occ(int[]ar,int n){
        int occ=0;
        for (int i = 0; i < ar.length; i++) {


            if (ar[i] == n) {
                occ++;
            }
        }
        return occ;
    }
    public void createCopied(int [] ar,int del) {
        int minusS = occ(ar, del);
        int size = ar.length-minusS;
        int[] cp = new int[size];
//

        for (int i = 0,j=0; i < ar.length; i++) {
            if(ar[i]==del)i++;
            if(j < cp.length)
                cp[j]=ar[i];
            j++;

        }


            for (int e : cp) {
                System.out.print(e + " ");
            }

        System.out.println();
        System.out.println(ar.length);
        System.out.println(cp.length);


    }
    static void main() {
        CreateNewArrayDeletingELE cc= new CreateNewArrayDeletingELE();
        int [] ar= {2,4,3,5,6,7,3,99,77,53,3};
        for(int e: ar){
            System.out.print(e+" ");
        }
        System.out.println();
        cc.createCopied(ar,3);


    }
}
