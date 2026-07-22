/*
------------------------------------------------------
Problem: Shuffle The Array

Pattern: Array Traversal

Approach:
In this problem I have created a new array to store the values of suffled array.
After trying for approach I have identified a pattern how values are changing
when ever the index is odd one we are assigning nums[n] to that index if not
then I'm using a new variable k assigned 1 to it the i'm assigning nums[k-1] 
to that index then incrementing k value.


Time Complexity:O(n)

Space Complexity:O(n)

LeetCode :
https://leetcode.com/problems/shuffle-the-array/
------------------------------------------------------

*/
class ShuffleTheArray{
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int k=1;
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2!=0){
                res[i]=nums[n];
                n++;
            }
            else{
                
                res[i]=nums[i-k];
                k+=1;
            }
        }
        return res;
    }
}