/*
------------------------------------------------------
Problem: How Many Numbers Are Smaller Than the Current Number

Pattern: Array Traversal

Approach:
I have created a new array to store the count of smaller numbers.
Used two for loops one is to traverse the given array and second 
loop is to check whether numbers are smaller than or not of smaller 
then we will increment the count in res array.


Time Complexity:O(n^2)

Space Complexity:O(n)

LeetCode :
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
------------------------------------------------------

*/
public class SmallerThanTheCurrentNumber{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    res[i]+=1;
                }
            }
        }
        return res;
    }
}