/**
 *  Swap List Nodes in pairs
 * roblem Description

Given a linked list A, swap every two adjacent nodes and return its head.

NOTE: Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.



Problem Constraints

1 <= |A| <= 106



Input Format

The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format

Return a pointer to the head of the modified linked list.



Example Input

Input 1:

 A = 1 -> 2 -> 3 -> 4
Input 2:

 A = 7 -> 2 -> 1


Example Output

Output 1:

 2 -> 1 -> 4 -> 3
Output 2:

 2 -> 7 -> 1


Example Explanation

Explanation 1:

 In the first example (1, 2) and (3, 4) are the adjacent nodes. Swapping them will result in 2 -> 1 -> 4 -> 3
Explanation 2:

 In the second example, 3rd element i.e. 1 does not have an adjacent node, so it won't be swapped. 
 */

 /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
       return reverseList(A,2);
    }

    public ListNode reverseList(ListNode A,int B){
        int count=0;
        ListNode curr=A;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null && count<B){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
                //curr=curr.next;
        } 
        if(next!=null){
            A.next=reverseList(next,B);
        }
        return prev;

    }

    
}


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
            if(A==null||A.next==null)return A;
            ListNode dummy=new ListNode(-1);
            dummy.next=A;
            ListNode prev=dummy;
            ListNode curr=dummy;
            ListNode next=dummy;
            while(true){
                next=curr.next;
                curr.next=prev;
                if(next==null || next.next==null){
                    prev.next=next;
                    break;
                }
                prev.next=next.next;
                prev=next;
                curr=prev.next;
                
            }
            return dummy.next;

    }
}

