package leetcode;

public class RemoveDuplicates {
    // https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
    // >>TODO 时间复杂度 O(n)   额外空间复杂度 O(1)

    public int removeDuplicates(int[] nums) {
        int current = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[current] = nums[i + 1];
                current++;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(obj.removeDuplicates(nums1));
        System.out.println(obj.removeDuplicates(nums2));
    }
}
