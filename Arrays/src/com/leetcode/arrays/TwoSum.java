package com.leetcode.arrays;

import java.util.HashMap;

/*
 * 1. Two Sum
Easy


Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
public class TwoSum {

	
	 public int[] twoSum(int[] nums, int target) {

		    HashMap<Integer,Integer> map = new HashMap<>();
		    for(int i=0;i<nums.length;i++){
		        int tmp = target - nums[i];
		        if(map.containsKey(tmp) )
		             return new int[]{map.get(tmp),i};
		        map.put(nums[i],i);
		    }
		    return new int[]{};
		}
}
