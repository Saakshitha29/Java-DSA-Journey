import java.util.Arrays;
/*
------------------------------------------------------
Problem: Squares of a Sorted Array

Pattern: Array Traversal

Approach:
Here I have created a new array to store the square values and then sorted the array.


Time Complexity:O(n^2)

Space Complexity:O(n)

LeetCode :
https://leetcode.com/problems/squares-of-a-sorted-array/
------------------------------------------------------

*/
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
}
