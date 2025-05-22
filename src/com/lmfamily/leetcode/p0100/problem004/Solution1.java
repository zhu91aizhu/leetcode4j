package com.lmfamily.leetcode.p0100.problem004;

public class Solution1 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            int ni = nums1[i];
            int nj = nums2[j];
            if (ni < nj) {
                nums[i+j] = ni;
                i++;
            }
            else {
                nums[i+j] = nj;
                j++;
            }
        }

        if (i < nums1.length) {
            System.arraycopy(nums1, i, nums, i+j, nums1.length - i);
        }

        if (j < nums2.length) {
            System.arraycopy(nums2, j, nums, i+j, nums2.length - j);
        }

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }
        else {
            return nums[nums.length / 2];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }

}
