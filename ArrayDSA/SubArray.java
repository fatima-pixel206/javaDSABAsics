package If_Else.ArrayDSA;

public class SubArray {

        public int subarraySum(int[] nums, int k) {
            int count = 0;
            int currentSum = 0;
            int left = 0;

            for (int right = 0; right < nums.length; right++) {
                // Window ko right se barhain
                currentSum += nums[right];

                // Agar sum target se barh gaya, to left se window choti karein
                while (currentSum > k && left <= right) {
                    currentSum -= nums[left];
                    left++;
                }

                // Check karein kya sum target ke barabar hai
                if (currentSum == k) {
                    count++;
                }
            }
            return count;
        }

    static void main() {
            SubArray obj = new SubArray();
       obj. subarraySum(new int[]{3,6,7,8-2,67,42,7},15);
    }
    }


