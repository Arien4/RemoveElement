package practice;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int i = 0;

        while (i < k) {
            if (nums[i] == val) {
                while (k - 1 > i && nums[k - 1] == val) {
                    k--;
                }
                nums[i] = nums[k - 1];
                k--;
            }
            i++;
        }

        return k;
    }
}
