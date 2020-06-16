package leetcode;

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
