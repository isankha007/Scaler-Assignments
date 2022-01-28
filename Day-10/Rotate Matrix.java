/**
 * Problem Description

You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints

1 <= n <= 1000



Input Format

First argument is a 2D matrix A of integers



Output Format

Return the 2D rotated matrix.



Example Input

Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1]
 ]


Example Output

Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [1]
 ]


Example Explanation

Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
Explanation 2:

 2D array remains the ssame as there is only element.
 */


public class Solution {
    public void solve(int[][] A) {
        int len=A.length;//int i=0;
      // while(len>0){
      for(int i=0;i<len/2;i++){
            for(int j=i;j<len-1-i;j++){
                int temp=A[i][j];
                A[i][j]=A[len-1-j][i];
                A[len-1-j][i]=A[len-1-i][len-1-j];
                A[len-1-i][len-1-j]=A[j][len-i-1];
                A[j][len-i-1]=temp;
                
            }
            //i++;
            //len=len-2;
        }
    }
}

public class Solution {
    public void solve(int[][] A) {
        int len=A.length;//int i=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            int k=len-1;
            for(int j=0;j<(len)/2;j++){
                int temp=A[i][j];
                A[i][j]=A[i][k];
                A[i][k--]=temp;
            }
        }
    
    }
}
