/*
------------------------------------------------------
Problem:Final Value of Variable After Performing Operations

Pattern: Array Traversal

Approach:
Created a variable named x and assigned 0 to it.
I have used a for loop to traversal the String array 
and I have used condtional statement to check whcih string 
does that values belongs to according to that I'll perform the value. 

Time Complexity:O(n)

Space Complexity:O(n)

LeetCode :
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
------------------------------------------------------

*/

public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
    int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X")){
                x++;
            }else if(operations[i].equals("X++")){
                x++;
            }else if(operations[i].equals("--X")){
                x--;
            }else if(operations[i].equals("X--")){
                x--;
            }
        }
        return x;
    }
}
