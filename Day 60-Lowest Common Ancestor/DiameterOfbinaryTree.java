Problem Description

Given a Binary Tree A consisting of N integer nodes, you need to find the diameter of the tree.

The diameter of a tree is the number of edges on the longest path between two nodes in the tree.



Problem Constraints

0 <= N <= 105



Input Format

First and only Argument represents the root of binary tree A.



Output Format

Return an single integer denoting the diameter of the tree.



Example Input

Input 1:

           1
         /   \
        2     3
       / \
      4   5
Input 2:

            1
          /   \
         2     3
        / \     \
       4   5     6


Example Output

Output 1:

 3
Output 2:

 4


Example Explanation

Explanation 1:

 Longest Path in the tree is 4 -> 2 -> 1 -> 3 and the number of edges in this path is 3 so diameter is 3.
Explanation 2:

 Longest Path in the tree is 4 -> 2 -> 1 -> 3 -> 6 and the number of edges in this path is 4 so diameter is 4.



 /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    class Info{
        int h=0;
        int d=0;
        Info(int _h,int _d){
            this.h=_h;
            this.d=_d;
        }

    }
    public int solve(TreeNode A) {
        Info ans=traveseRec(A);
        return ans.d;
    }
    public Info traveseRec(TreeNode A){
            if(A==null){
                return new Info(-1,0);
            }
            Info left=traveseRec(A.left);
            Info right=traveseRec(A.right);
            int currH=1+Math.max(left.h,right.h);
            int currD=Math.max(Math.max(left.h+right.h+2,left.d),right.d);
            return new Info(currH,currD);


    }
}
