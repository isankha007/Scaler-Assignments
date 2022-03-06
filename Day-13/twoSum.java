/**
 * Problem Description

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<A.size();i++){
            if(hm.containsKey(B-A.get(i))){
                res.add(hm.get(B-A.get(i)));
                res.add(i+1);
                break;
            }
            hm.putIfAbsent(A.get(i),i+1);

        }
       /* int index1=-1;
        int index2=Integer.MAX_VALUE;
       Map<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<A.size();i++){
            if(hm.containsKey(A.get(i))){
                hm.get(A.get(i)).add(i);
            }else{
                 ArrayList<Integer> arr= new ArrayList<Integer>();
                 arr.add(i);
                 hm.put(A.get(i),arr);
            }
        }
        
        for(int i=0;i<A.size();i++){
            int rem=B-A.get(i);
            if(hm.containsKey(rem)){
                int indexToFind;
                if(hm.get(rem).size()>1 && hm.get(rem).get(0)<=i){
                    indexToFind=hm.get(rem).get(1);
                }else{
                    indexToFind=hm.get(rem).get(0);
                }
                //System.out.println("+++++"+indexToFind);
                if(indexToFind>i)
                {
                    if(index2>indexToFind)
                    {
                        index2=indexToFind;
                        index1=i;
                    }
                     
                }
            }
        }
        if(index2!=Integer.MAX_VALUE){
            res.add(0,index1+1);
            res.add(1,index2+1);
        }*/
        return res;
        
    }
}
