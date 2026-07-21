/*
------------------------------------------------------
Problem : 1920. Build Array from Permutation

Pattern : Array Traversal

Approach :
There i have created new Array of length as
 the given array and i have stored nums[nums[i]] 
 in every index of the new arrray which I have 
created using for loop to iterate over all elements in the given array.

Time complexity: O(n)

Space Complexity: O(n)

LeetCode :
https://leetcode.com/problems/build-array-from-permutation/
------------------------------------------------------
*/

class BuildArrayFromPermutation{
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}