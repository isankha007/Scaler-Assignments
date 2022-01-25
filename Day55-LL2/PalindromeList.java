/**
 * Palindrome List
 * 
 * Given a singly linked list A, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.


Problem Constraints

1 <= |A| <= 105

Input Format

The first and the only argument of input contains a pointer to the head of the given linked list.


Output Format

Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.


Example Input

Input 1:

A = [1, 2, 2, 1]
Input 2:

A = [1, 3, 2]


Example Output

Output 1:

 1 
Output 2:

 0 


Example Explanation

Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
 * 
 * 
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
    public int lPalin(ListNode A) {
        //we will find the middle
        //take the second half and reverse it 
        //traverse fist and second half and if value does not match return 0
        //else at the end return 1;
        ListNode dummy=new ListNode(0);
        dummy.next=A;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       
        // if(fast!=null)
        //   slow=slow.next;
       // System.out.println(second);
        //revese 
        ListNode curr=slow;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        // System.out.println(prev);

        ListNode second=prev;
        ListNode head2=dummy.next;
        while(second!=null && head2!=null){
            if(head2.val!=second.val)return 0;
            second=second.next;
            head2=head2.next;
        }
    return 1;


    }
    public ListNode reverse(ListNode curr){
       // ListNode curr=second;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
