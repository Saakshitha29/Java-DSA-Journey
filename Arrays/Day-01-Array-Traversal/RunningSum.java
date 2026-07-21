/*
------------------------------------------------------
Problem:Running Sum of 1d Array

Pattern: Array Traversal

Approach:
I have used variable named sum to store the Running sum 
of the given array.I have created a new array to store
the values of running sum.Using the addition I have completed the problem.

 Time Complexity:O(n)

 Space Complexity:O(n)

 LeetCode :
 https://leetcode.com/problems/running-sum-of-1d-array/
------------------------------------------------------

*/

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;

   }
}
