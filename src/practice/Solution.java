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

        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("k = "   + k);
        return k;
    }
}
