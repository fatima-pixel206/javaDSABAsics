package If_Else.ArrayDSA;

public class GFGSolution {

        public  static boolean isSorted(int[] arr) {
            // code here
            boolean flg = true;
            if (arr.length < 2) {
                flg = true;
            } else {
                for (int i = 0; i < arr.length - 1; i++) {

                    if (arr[i] > arr[i + 1]) {
                        flg = false;
                        break;
                    }
                }

            }
            return flg;
        }

    static void main() {
        System.out.println( isSorted(new int[]{5}));
    }
    }

