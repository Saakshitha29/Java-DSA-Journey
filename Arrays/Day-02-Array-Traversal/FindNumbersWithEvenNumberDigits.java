/*
------------------------------------------------------
Problem: How Many Numbers Are Smaller Than the Current Number

Pattern: Array Traversal

Approach:
I hahve created a variable to store the count of numbers whose digits are even.
Then using for loop to traverse the given array inside that i have used the while 
loop to count the number of digits in the number for that index after finding  
checking whether count is even or odd and if even then we will increase the actual 
count if not we will assign 0 to the digitcount.

Time Complexity:O(n)

Space Complexity:O(1)

LeetCode :
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
------------------------------------------------------

*/
public class FindNumbersWithEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count=0;
        int digitCount=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                digitCount++;
                nums[i]/=10;  
            }
            if(digitCount%2==0&&nums[i]==0){
                count++;
                digitCount=0;
            }else{
                digitCount=0;
            }
        }
        return count;
    }
}
