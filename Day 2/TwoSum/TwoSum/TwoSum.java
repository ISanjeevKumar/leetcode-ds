
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numbers = new HashMap<>();
        int currentValue = 0;
        for (int index = 0; index < nums.length; index++) {
            currentValue = target - nums[index]; // 2
            if (numbers.containsKey(currentValue)) {
                return new int[] { numbers.get(currentValue), index };
            } else {
                numbers.put(nums[index], index); // 2, 0
            }

        }
        return new int[] {};
    }
}
