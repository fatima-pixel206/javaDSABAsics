package If_Else.ArrayInMemory;



    /*
    Here the no of operation are  half of n if n=10
            1+2+3+4+5....   n
            n(n-1)/2
            because of inner loop is start from i+1

     */
    public class ModeOfArray {
        public void mode(int[]ar) {
            int mode=0;

            // finalOcc=0;
            int maxCount=0;
            for (int i = 0; i < ar.length ; i++) {
                int occ = 1;
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        occ++;

                    }


                }
                if (occ > maxCount) {
                    maxCount=occ;
                    mode=ar[i];
                }
            }


            System.out.println("Mode is " +mode + ", " + maxCount + " times, ");

            // j++;

        }
        static void main() {
            ModeOfArray mode = new ModeOfArray();
            mode.mode(new int[]{1,2,3,5,6,7,8,9,9,10,4,7,7,5,7});
        }
    }

