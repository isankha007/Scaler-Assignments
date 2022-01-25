/**
 * Problem Description

A linked list A is given such that each node contains an additional random pointer which could point to any node in the list or NULL.

Return a deep copy of the list.



Problem Constraints

0 <= |A| <= 106



Input Format

The first argument of input contains a pointer to the head of linked list A.


Output Format

Return a pointer to the head of the required linked list.


Example Input

Given list
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  

Example Output

   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  
Example Explanation

You should return a deep copy of the list. The returned answer should not contain the same node as the original list, 
but a copy of them. The pointers in the returned list should not link to any node in the original input list.
 */

 /**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        //we will first make copy of temp node and connect the next of original to it
        ///then in second iteration connect the random and restore the original
        RandomListNode curr=head;
        RandomListNode temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=new RandomListNode(curr.label);;
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null && curr.next!=null){
            curr.next.random=curr.random!=null?curr.random.next:curr.random;
            curr=curr.next.next;
        }
        ///resoring original list
        RandomListNode original=head,copy=head.next;
        temp=copy;
        while(original!=null && copy!=null){
                original.next=original.next.next;
                copy.next=(copy.next!=null)?copy.next.next:copy.next;
                original=original.next;
                copy=copy.next;
        }
        return temp;

    }
}

