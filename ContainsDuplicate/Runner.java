package ContainsDuplicate;

class Runner {

    public static boolean containsDuplicate(int[] nums) {

        int[] copyOfNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copyOfNums[i] = nums[i];
            for (int j = i + 1; j <= nums.length; j++) {
                if (nums[j] == copyOfNums[i]) {
                    return false;
                }
            }
        }
        return true;

    }
}