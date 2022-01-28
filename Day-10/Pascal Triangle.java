/**
 * Problem Description

Write a program to input an integer N from user and print pascal triangle up to N rows.



Problem Constraints

1 <= N <= 25



Input Format

First line is an integer N.



Output Format

N lines whose each row contains N+1 space separated integers.



Example Input

Input 1:

3
Input 2:

5


Example Output

Output 1:

1 0 0 
1 1 0 
1 2 1 
Output 2:

1 0 0 0 0
1 1 0 0 0
1 2 1 0 0
1 3 3 1 0
1 4 6 4 1 


Example Explanation

Explanation 1:

Row 1 = 1 0 0 0 0
Row 2 = 1C0 1C1 0 0 0= 1 1 0 0 0
Row 3 = 2C0 2C1 2C2 0 0= 1 2 1 0 0
Row 4 = 3C0 3C1 3C2 3C3 0= 1 3 3 1 0
 */


public class Solution {
    public int[][] solve(int A) {
        int[][] resMat=new int[A][A];
        
        for(int i=0;i<A;i++){
            int k=1;
            for(int j=0;j<=i;j++){
                if(i==0||i==1){
                   resMat[i][j]=1;
                }else if(i>=2&&j>0){
                   resMat[i][j]=resMat[i-1][j]+resMat[i-1][j-1];
                }else{
                    resMat[i][j]=1;
                }
            }
        }
        return resMat;
    }
}

