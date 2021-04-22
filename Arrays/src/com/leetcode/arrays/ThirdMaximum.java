package com.leetcode.arrays;

/*414. Third Maximum Number
Easy
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.*/
public class ThirdMaximum {

    public int thirdMax(int[] nums) {
   		int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    boolean thirdExists = false;
    for (int i=0; i<nums.length; i++) {
      if (nums[i] >= first) {
        first = nums[i];
      }
    }
    for (int i=0; i<nums.length; i++) {
      if (nums[i] != first && nums[i] >= second) {
        second = nums[i];
      }
    }
    for (int i=0; i<nums.length; i++) {
      if (nums[i] != first && nums[i] != second && nums[i] >= third) {
        third = nums[i];
        thirdExists = true;
      }
    }
    if (thirdExists) {
      return third;
    } else {
      return first;
    }
        
    }

	public static void main(String[] args) {
		ThirdMaximum t1 = new ThirdMaximum();
		int[] nums = { 1,2 };
		int result = t1.thirdMax(nums);
		System.out.println("Third Maximum is ::" + result);
	}

}
