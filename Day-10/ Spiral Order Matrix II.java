/**
 *  Spiral Order Matrix II
 * Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Problem Constraints

1 <= A <= 1000



Input Format

First and only argument is integer A


Output Format

Return a 2-D matrix which consists of the elements in spiral order.

Example Input

Input 1:

1
Input 2:

2


Example Output

Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]


Example Explanation

Explanation 1:

 
Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
 */


public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] res=new int[A][A];
        int T=0;int B=A-1;int L=0;int R=A-1;
        int dir=0;
        int num=1;
        while((T<=B)&&(L<=R)){
            if(dir==0){
                for(int i=L;i<=R;i++){
                    res[T][i]=num++;
                }
                dir=1;
                T++;
            }
            else if(dir==1){
                for(int i=T;i<=B;i++){
                    res[i][R]=num++;
                }
                dir=2;
                R--;
            }
            else if(dir==2){
                for(int i=R;i>=L;i--){
                    res[B][i]=num++;
                }
                 B--;
                dir=3;
            }else if(dir==3){
                for(int i=B;i>=T;i--){
                    res[i][L]=num++;
                }
                dir=0;
                L++;
            }
        }
        return res;
    }
}
