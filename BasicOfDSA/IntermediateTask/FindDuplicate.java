package If_Else.BasicOfDSA.IntermediateTask;

public class FindDuplicate {
    public void findDuplicate(int[] ar) {
        ;
        for (int i = 0; i < ar.length; i++) {
            int dup = 0;
            int occ = 1;
                boolean isSeen= false;
                for (int k = 0 ; k <i; k++) {
                    if (ar[k] == ar[i]) {
                        isSeen= true;
                        break;
                    }

                }
                if(isSeen)
            continue;
            for (int j = i + 1; j < ar.length; j++) {

                if (ar[i] == ar[j]) {
                    dup = ar[i];
                    occ++;
                }
            }
            if (occ > 1) {
                System.out.println(" duplicate is " + dup +" occurs "+ occ + " times");

            }

        }
    }

    static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        fd.findDuplicate(new int[]{2,4,2,6,4,7,84,4});
    }
}
