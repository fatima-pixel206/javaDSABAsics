package If_Else.ArrayDSA.Task;

class Solution {
    public int[] twoSum(int[] nums, int target) {
            int ar[] = new int[2];
        for(int i=0; i<nums.length;i++){
            for (int j = i+1; j <nums.length ; j++) {


                if ((nums[i] + nums[j]) == target) {
                    ar[0] = i;
                    ar[1] = j;
                }
            }
        }
        return ar;
    }

    static void main() {
        Solution s= new Solution();
        int[] ar=s.twoSum(new int[]{3,3},6);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i);
        }

    }
}