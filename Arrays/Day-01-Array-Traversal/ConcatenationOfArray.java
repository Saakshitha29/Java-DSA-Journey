/*
------------------------------------------------------
Probelm:Concatenation-of-array

Pattern: Array Traversal

Approach:
I have created the new Array of length double of the given 
array (2*nums.length) because when we concatinate them 
the new array size will doubles so that's why and I have 
used a for loop to traversal the given array to get the 
values of it and new array to store values.Here I have 
used conditional statements there I have checked if (i<nums.length) 
do traversal in given array and we can find values if this 
condition is true,else we need to start  from 0 to continue 
so I have used another variable j and assigned 0 
to it and in else block I've incremented it.

Time Complexity:O(n)

Space Complexity:O(n)

LeetCode :
https://leetcode.com/problems/concatenation-of-array/
------------------------------------------------------

*/
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        int j=0;
        for(int i=0;i<2*nums.length;i++){
            
            if(i<nums.length)
            arr[i]=nums[i];
            else{
                
            arr[i]=nums[j++];
            }
            
        }
        return arr;
    }
}
