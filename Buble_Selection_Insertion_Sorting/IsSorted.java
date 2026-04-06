package If_Else.Buble_Selection_Insertion_Sorting;

public class IsSorted {
    public boolean  isSorted(int[]ar) {
        int j = 1;
        int i = 0;
        boolean isFlag = true;
        while (i < ar.length && j < ar.length) {

            if (ar[i] > ar[j]) {
                isFlag=false;
                break;
            }
            else if(ar[i]<=
                    ar[j]){
                isFlag=true;
                i++;
                j++;
            }

        }
        return isFlag;
    }
    static void main() {
        IsSorted is = new IsSorted();
        System.out.println(is.isSorted(new int[]{1,2,3,1,2,3,4,5,6,8}));
        System.out.println(is.isSorted(new int []{-11,1,1,4,6,7,8,9,}));

    }
}
