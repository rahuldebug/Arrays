package com.leetcode.arrays;
/*11. Container With Most Water
Medium

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int aptr= 0;
        int bptr= height.length-1;
        int MaxVal=0;
        while (bptr>aptr){
            if (height[aptr]<height[bptr]){
                MaxVal=Math.max(MaxVal,height[aptr]*(bptr-aptr));
                aptr+=1;
            }else{
                MaxVal=Math.max(MaxVal, height[bptr]*(bptr-aptr));
                bptr-=1;
            }
        }return MaxVal;
    }
}
