package com.company.easy;

import java.util.HashMap;

public class 两数之和1 {

    public int[] twoSum(int[] nums, int target) {
//        return violentGet(nums, target);
        return mapGet(nums, target);
    }

    /**
     * 普通方式(55 ms, 38.4 MB)
     *
     * @param nums   源数组
     * @param target 目标值
     * @return 下标
     */
    private int[] violentGet(int[] nums, int target) {
        // 双指针，故双重遍历
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // 题目已经明确有结果，故必有返回值
        return null;
    }

    /**
     * 空间换时间(2 ms, 38.6 MB)
     * 内核成本高于内存
     *
     * @param nums   源数组
     * @param target 目标值
     * @return 下标
     */
    private int[] mapGet(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 一层遍历
        for (int i = 0; i < nums.length; i++) {
            Integer theOtherOneIndex = map.get(target - nums[i]);
            if (theOtherOneIndex == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{i, theOtherOneIndex};
            }
        }
        // 题目已经明确有结果，故必有返回值
        return null;
    }

}
