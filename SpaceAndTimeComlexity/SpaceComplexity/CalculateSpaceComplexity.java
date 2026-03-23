package SpaceAndTimeComlexity.SpaceComplexity;
/*
Dated 16,March 2026
     SpaceComplexity and auxiliary space.
      auxiliary space is extra space taken to solve problem and data structures
 */
public class CalculateSpaceComplexity {

    // approach 1
    public static void findELe(int[] ar) {
        int n = ar.length;
        boolean[] flag = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            int ele = ar[i];
            if (flag[ele] == true) {
                System.out.println(ele);
            } else {
                flag[ele] = true;
            }
// ? number of op are 6 but taking more space taking
            /*auxiliary complexity
            // is O(n) because new array is same size of n
            space comp is also O(2n)= O(n)
            2n because there are two array size of n
            */
        }

    }
    // approach 2
    public static void duplicate(int[]ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println(ar[i] + " duplicate");
                    break;
                }
            }

        }
        /*
        here space comp is O(n)
        and auxiliary comp  is 0 b/c no extra space is taken
        constant space
       A.s O(1)
         */
    }
}
