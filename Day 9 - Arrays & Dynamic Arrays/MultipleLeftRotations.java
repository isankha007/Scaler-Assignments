// public class MultipleLeftRotations {
    
// }
//Multiple left rotations of the array
/**
 * Problem Description

Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.



Problem Constraints

1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000


Input Format

The first argument given is the integer array A.
The second argument given is the integer array B.


Output Format

Return the resultant matrix.


Example Input

Input 1:
 
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:

  
    A = [5, 17, 100, 11]
    B = [1]

Example Output

Output 1:
 
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:

    
    [ [17, 100, 11, 5] ]



Example Explanation

for input 1 -> B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 4]
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
          Integer len= A.size();
          ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
          for(int i=0;i<B.size();i++){
             Integer rotation=B.get(i);
             if(rotation>len)rotation=rotation%len;
             ArrayList<Integer> arr = new ArrayList<>(A);
             reverse(rotation,len,arr);
             reverse(0,rotation,arr); 
             reverse(0,len,arr);
             //System.out.println(arr);
             res.add(arr);
          }
             
        return res;
        
    }
    
    public static void reverse(int start,int end,ArrayList<Integer> arr){
        int j=end-1;
            for(int i=start;i<j;i++,j--)
            {
                //use XOR 
                  arr.set(i,(arr.get(i)^arr.get(j)));
                  arr.set(j,(arr.get(i)^arr.get(j)));
                  arr.set(i,(arr.get(i)^arr.get(j)));
            }
            //System.out.println(arr);
    }
}

