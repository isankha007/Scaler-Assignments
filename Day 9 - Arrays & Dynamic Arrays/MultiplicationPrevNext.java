// public class MultiplicationPrevNext {
    
// }
//Multiplication of previous and next
/**
 * Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication of last and second last.


Input Format

The only argument given is the integer array A.
Output Format

Return the updated array.
Constraints

1 <= length of the array <= 100000
-10^4 <= A[i] <= 10^4 
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]

Input 2:
    A = [5, 17, 100, 11]
Output 2:
    [85, 500, 187, 1100]
 */
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int j=0;
        int len =A.size();
        ArrayList<Integer> res=new ArrayList<Integer>(0);
        for(int i=0;i<len;i++){
            if(i==0&&(i+1)<len){
                Integer temp=A.get(i)*A.get(i+1);
                res.add(temp);
            }else if(i==len-1&&len>1){
                Integer temp=A.get(i)*A.get(i-1);
                res.add(temp);
            }else if(i!=0 && i!=len-1){
                Integer temp=A.get(i+1)*A.get(i-1);
                res.add(temp);
            }else{
                Integer temp=A.get(i);
                res.add(temp);
            }
        }
        return res;
    }
}

