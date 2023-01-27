package com.akash.JavaProject.service.easy;


public class EasyImpl implements Easy {
    private final int[] ints = new int[2];


    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ints[0] = i;
                    ints[1] = j;
                    return ints;
                }
            }
        }
        ints[0] = -1;
        ints[1] = -1;
        return ints;
    }

    @Override
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            count++;
        }
        return count;
    }

    @Override
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        if (nums.length == 1 && target > nums[0]) {
            return 1;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) {
                result = i;
                break;
            } else if (target > nums[i] && target <= nums[i + 1]) {
                result = i + 1;
                break;
            } else if (target > nums[i + 1] && (nums.length - 1 == i + 1)) {
                result = nums.length;
                break;
            } else if (target < nums[i] && i == 0) {
                result = 0;
                break;
            } else if (target > nums[i] && target > nums[i + 1]) {
                continue;
            }
        }

        return result;

    }

    @Override
    public int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }
        return len;
    }

    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints = new int[m + n];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                ints[i] = nums1[i];
            }

        }
        for (int i = 0; i < n; i++) {
            ints[m] = nums2[i];
            m = m + 1;
        }
        for (int i = 0; i < ints.length; ++i) {
            if (int[i]<)
        }
        for (int i = 0; i < ints.length; ++i) {
            System.out.println(ints[i]);
        }

    }
}
