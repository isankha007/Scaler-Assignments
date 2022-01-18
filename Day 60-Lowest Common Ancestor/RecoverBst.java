Q3. Recover Binary Search Tree

Problem Description
Two elements of a binary search tree (BST),represented by root A are swapped by mistake. Tell us the 2 values swapping which the tree will be restored.

A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of the tree,A



Output Format
Return the 2 elements which need to be swapped.



Example Input
Input 1:

 
         1
        / \
       2   3
Input 2:

 
         2
        / \
       3   1



Example Output
Output 1:

 [2, 1]
Output 2:

 [3, 1]


Example Explanation
Explanation 1:

Swapping 1 and 2 will change the BST to be 
         2
        / \
       1   3
which is a valid BST 
Explanation 2:

Swapping 1 and 3 will change the BST to be 
         2
        / \
       1   3
which is a valid BST 


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
//https://www.tutorialcup.com/interview/tree/recover-binary-search-tree.htm idea I used
public class Solution {
    public ArrayList<Integer> recoverTree(TreeNode A) {
        //we will use morris traversal and keep three variable fisrt ,second,prev to track the inversion
        int prev,first,second;
        prev=first=second=-1;
        TreeNode rightMost=null;
        TreeNode curr=A;
        while(curr!=null){
            if(prev!=-1 && curr.val<prev){
                if(first==-1){
                    first=prev;
                }
                second=curr.val;
            }
            if(curr.left!=null){
                rightMost = curr.left;
                // we may have visited the left tree before, and connect the rightmost node with curr node (root node)
                while(rightMost.right != null && rightMost.right != curr)
                    rightMost = rightMost.right;

                if(rightMost.right == curr)
                {
                    rightMost.right = null;
                    prev = curr.val;
                    curr = curr.right;
                }
                else
                {
                    rightMost.right = curr;
                    curr = curr.left;
                }    
            }
            else    
            {
                // no left tree, then just visit its right tree
                prev = curr.val;
                curr = curr.right;
            
            }
            
        }
        ArrayList<Integer> ans=new ArrayList();
        ans.add(second);
        ans.add(first);
        return ans;
    }
}
