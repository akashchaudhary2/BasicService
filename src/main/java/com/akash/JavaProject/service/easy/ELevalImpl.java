package com.akash.JavaProject.service.easy;


import java.util.*;

public class ELevalImpl implements ELevel {
    private final int[] ints = new int[2];


    @Override
    public void ListObjects() {
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new Stack();
        List list4 = new Vector();
    }

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
        n = nums2.length;
        for (int i = 0; i < nums2.length; ++i) {
            nums1[n] = nums2[i];
            n = n + 1;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }


}

