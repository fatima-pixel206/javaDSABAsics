package If_Else.ArrayDSA;
import java.util.HashMap;
import java.util.Map;

public class InterviewArray {
    public static int[] twoSum(int[] nums, int target) {
        // Ek HashMap banate hain values aur unke index ko store karne ke liye
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Agar complement map mein maujood hai, toh humein result mil gaya
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Nahi toh current number aur index ko map mein daal dein
            map.put(nums[i], i);
        }

        // Agar koi solution na mile
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
