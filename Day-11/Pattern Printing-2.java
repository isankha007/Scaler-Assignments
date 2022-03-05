/**
 * Q3. Pattern Printing -2
 * 
 * Problem Description

Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

    1
  2 1
3 2 1


Problem Constraints

1 <= A <= 1000


Input Format

First and only argument is an integer denoting A.



Output Format

Return a two-dimensional array where each row in the returned array represents a row in the pattern.



Example Input

Input 1:

 A = 3
Input 2:

 A = 4


Example Output

Output :1

 [ 
   [0, 0, 1]
   [0, 2, 1]
   [3, 2, 1]
 ]
Output 2:

 [ 
   [0, 0, 0, 1]
   [0, 0, 2, 1]
   [0, 3, 2, 1]
   [4, 3, 2, 1]
 ]


Example Explanation

Explanation 2:

 
 For A = 4 pattern looks like:  
                                   1
                                 2 1
                               3 2 1
                             4 3 2 1
 So we will return it as two-dimensional array. 
 Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.
 * 
 */

public class Solution {
    public int[][] solve(int A) {
       int[][] ans=new int[A][A];
       for(int i=0;i<A;i++){
           for(int j=0;j<=i;j++){
               ans[i][A-j-1]=j+1;
           }
       }
       return ans;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> mat= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++){
            mat.add(new ArrayList<Integer>());
            for(int j=0;j<A;j++){
                mat.get(i).add(0);
            }
        }

        for(int i=0;i<A;i++){
            int j=A-1;
            int countSpace=0;
            while(countSpace<=i){
                mat.get(i).set(j,A-j);
                countSpace++;
                j--;
            }
        }
        return mat;
    }
}