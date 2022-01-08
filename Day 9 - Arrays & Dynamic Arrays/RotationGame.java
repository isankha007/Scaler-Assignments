// public class RotationGame {
    
// }
/**
 * Problem Description

You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.


Problem Constraints

1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109


Input Format

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B


Output Format

Print an array of integers which is the Bth right rotation of input array A, on a separate line.

Example Input

Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output

Output 1:

 3 4 1 2
Output 2:

 1 2 2


Example Explanation

Explanation 1:

 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

Explanation 2:


 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
 */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner=new Scanner(System.in);
            String[] str=scanner.nextLine().split(" ");
            int[] arr=new int[str.length-1];
            int len=arr.length;
            
            for(int i=1;i<str.length;i++){
                arr[i-1]=Integer.parseInt(str[i]);
            }
             int rotation=Integer.parseInt(scanner.nextLine());
             if(rotation>len)rotation=rotation%len;
             reverse(0,len,arr);
             reverse(0,rotation,arr);
             reverse(rotation,len,arr);
            for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
            }
      
        
    }
    public static void reverse(int start,int end,int[] arr){
        int j=end-1;
            for(int i=start;i<j;i++,j--)
            {
                //use XOR 
                // int temp=arr[i];
                  arr[i]=arr[i]^arr[j];
                  arr[j]=arr[i]^arr[j];
                  arr[i]=arr[i]^arr[j];
            }
    }
}
