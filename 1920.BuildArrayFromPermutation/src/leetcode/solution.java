package leetcode;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        solution main = new solution();
        int[] ex1 = {0, 2, 1, 5, 3, 4}; // Output: [0,1,2,4,5,3]
        int[] ex2 = {5, 0, 1, 2, 3, 4}; // Output: [4,5,0,1,2,3]
        System.out.println(Arrays.toString(main.usageMemory(ex1)));
        System.out.println(Arrays.toString(main.usageMemory(ex2)));
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums[i]] < nums.length) {
                ans[i] = nums[nums[i]];
            }
        }
        return ans;
    }

    //o(1) for best usage of memory
    public int[] usageMemory(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = length * (nums[nums[i]] % length) + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / length;
        }
        return nums;
    }
}
