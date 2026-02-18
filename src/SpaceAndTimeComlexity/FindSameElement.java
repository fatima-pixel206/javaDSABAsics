package SpaceAndTimeComlexity;

public class FindSameElement {
    public static void findELe(int[] ar) {
        int n=ar.length;
        boolean []flag= new boolean[n+1];
        for (int i = 0; i <n ; i++) {
            int ele=ar[i];
            if (flag[ele]==true) {
                System.out.println(ele);
            } else
            {
                flag[ele]=true;
            }
// ? number
        }

    }

    public static void main(String[] args) {
        int[] ar={9,7,4,1,6,9,3,8,2,6,9};
        findELe(ar);
    }
}

