/**
 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.
 */


public class Solution {
    public int solve(int[] A) {
        int maxIndex=-1,minIndex=-1;
        int maxEle=Integer.MIN_VALUE,minEle=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int ele:A){
            maxEle=Math.max(maxEle,ele);
            minEle=Math.min(minEle,ele);
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==maxEle){
                maxIndex=Math.max(maxIndex,i);
            }
            if(A[i]==minEle){
                minIndex=Math.max(minIndex,i);
            }
            
            if(maxIndex!=-1 && minIndex!=-1){
                int len=Math.abs(maxIndex-minIndex)+1;
                ans=Math.min(ans,len);
            }
        }
        return ans;
        
    }
}
