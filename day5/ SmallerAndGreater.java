package day5;
// Smaller and Greater
/**
 * 
 * You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        //Set<Integer> set=new HashSet<>(A);
        //System.out.println(A.size()+"  ----"+set.size());
        int res= A.size()-2;
        if(A.size()<3)return 0;
        ArrayList<Integer> arr=new ArrayList<>();
        int frq=Collections.frequency(A,A.get(0));
        //System.out.println(frq);
        res-=frq-1;
        int frq2=Collections.frequency(A,A.get(A.size()-1));
        //System.out.println(frq2);
        res-=frq2-1;
        if(res<0)return 0;
        
        // for(Integer i:A){
        //     int frq=Collections.frequency(A,i);
        //     //System.out.println(frq+" "+i+" "+A.size()+" ----"+A.get(A.size()-1));
        //     if(frq>1 && !arr.contains(i)){
        //         if(i==A.get(0)||i==A.get(A.size()-1)){
        //           res-=(frq-1);
        //           arr.add(i);
        //         }
        //     }
        // }
        // if(res<0)return 0;
        return res;
    }
}
