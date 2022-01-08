// package Day 6 - Introduction to Number System and Bit Manipulation;

// public class CountTotalSetBits {
    
// }
/**
 * Q2. Count Total Set Bits
 * Problem Description

Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.



Problem Constraints

1 <= A <= 109



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the ( Total number of set bits in the binary representation of all the numbers from 1 to A )modulo 109 + 7.



Example Input

Input 1:

 A = 3
Input 2:

 A = 1


Example Output

Output 1:

 4
Output 2:

 1


Example Explanation

Explanation 1:

 DECIMAL    BINARY  SET BIT COUNT
    1          01        1
    2          10        1
    3          11        2
 1 + 1 + 2 = 4 
 Answer = 4 % 1000000007 = 4
Explanation 2:

 A = 1
  DECIMAL    BINARY  SET BIT COUNT
    1          01        1
 Answer = 1 % 1000000007 = 1
 */

public class Solution {
    public int solve(int A) {
        long n=A+1;
        long mod=1000*1000*1000+7;
        long ans=0;
        for(int i=0;i<32;i++){
            //GP
            long pair=(long)(2*(Math.pow(2,i)));
            long temp=0;
          //  System.out.println(" ---- "+pair);
            if((n%pair)-(pair/2)>0){
                temp=(n%pair-(pair/2));
                //System.out.println(n+"=== "+temp);
            }
            ans+=(n/pair)*(pair/2)+temp;
            ans%=mod;
           // System.out.println(pair+" ==="+ans);
            //ans+=
        }
        return (int)ans;
    }
}


public class Solution {
    public int solve(int A) {
        long n=A+1;
        long mod=1000*1000*1000+7;
        long ans=0;
        for(int i=0;i<32;i++){
            //GP
            long pair=(long)(2*(Math.pow(2,i)));
            long temp=0;
            //System.out.println(" ---- "+pair);
           // if(n<pair){
                temp=(n%(pair)-pair/2)<0?0:n%(pair)-pair/2;
               // System.out.println(n+" === "+temp);
           // }
            ans+=(n/pair)*(pair/2)+temp;;
            ans%=mod;
           // System.out.println(pair+" ==="+ans);
            //ans+=
        }
        return (int)ans;
    }
}


