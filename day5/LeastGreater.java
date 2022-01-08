package day5;
/*

Q2. Elements which have at-least two greater elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA
Problem Description

You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

NOTE: The result should have the order in which they are present in the original array.



Problem Constraints

3 <= |A| <= 105

-109 <= A[i] <= 109
Input Format

First and only argument is an integer array A.

Output Format

Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [11, 17, 100, 5]


Example Output

Output 1:

 [1, 2, 3]
Output 2:

 [11, 5]


Example Explanation

Explanation 1:

 Number of elements greater than 1: 4
 Number of elements greater than 2: 3
 Number of elements greater than 3: 2
 Number of elements greater than 4: 1
 Number of elements greater than 5: 0
 Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
Explanation 2:

 Number of elements greater than 11: 2
 Number of elements greater than 17: 1
 Number of elements greater than 100: 0
 Number of elements greater than 5: 3
 Elements 5 and 11 have atleast 2 elements strictly greater than themselves.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        //brute force approach
        ArrayList<Integer> resAl=new ArrayList<Integer>();
        int sz=A.size();
        int firstGreatest=Integer.MIN_VALUE;
        int secondGreatest=Integer.MIN_VALUE;
        for(Integer i:A){
            if(firstGreatest<i){
                secondGreatest=firstGreatest;
                firstGreatest=i;
            }else if(i>secondGreatest){
                secondGreatest=i;
            }
        }
        //System.out.println(firstGreatest+" "+secondGreatest);
        for(Integer i:A){
            if(i!=firstGreatest && i!=secondGreatest)resAl.add(i);
        }
        // for(int i=0;i<sz;i++){
        //     int count=0;
        //     for(int j=0;j<sz;j++){
        //         if(A.get(i)<A.get(j)){
        //             count++;
        //             if(count==2){
        //                 resAl.add(A.get(i));
        //                 break;
        //             }
        //         }
        //     }
        // }
        return resAl;
    }
}
