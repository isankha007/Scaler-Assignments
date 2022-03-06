/**
 * Common Elements
 * 
 * Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


Problem Constraints

1 <= N, M <= 105

1 <= A[i] <= 109



Input Format

First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format

Return an integer array denoting the common elements.



Example Input

Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]
 */

 //Novice Solution of mine ,can be optimized
 public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer,Integer> hm1=new HashMap<Integer,Integer>();
        Map<Integer,Integer> hm2=new HashMap<Integer,Integer>();
        ArrayList<Integer> res= new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            int m=1;
            if(hm1.containsKey(A.get(i))){
                m=hm1.get(A.get(i));
                m++;
            }
            hm1.put(A.get(i),m);
            
        }
        for(int i=0;i<B.size();i++){
            int m=1;
            if(hm2.containsKey(B.get(i))){
                m=hm2.get(B.get(i));
                m++;
            }
            hm2.put(B.get(i),m);
            
        }
        //System.out.println(hm1.size()+ " "+hm2.size());
        if(hm2.size()>=hm1.size()){
            for(Map.Entry<Integer,Integer> elm:hm1.entrySet()){
                if(hm2.containsKey(elm.getKey())){
                    int key=elm.getKey();
                    int maxIterate=hm2.get(key)<=hm1.get(key)?hm2.get(key):hm1.get(key);
                    for(int i=0;i<maxIterate;i++){
                        res.add(key);
                    }
                }
            }
        }else{
             for(Map.Entry<Integer,Integer> elm:hm2.entrySet()){
                if(hm1.containsKey(elm.getKey())){
                    int key=elm.getKey();
                    int maxIterate=hm2.get(key)<=hm1.get(key)?hm2.get(key):hm1.get(key);                     
                    for(int i=0;i<maxIterate;i++){
                        res.add(key);
                    }
                }
            }
        }
        
       //System.out.println(hm2);
        return res;
    }
}
///
//https://www.scaler.com/academy/mentee-dashboard/class/9577/assignment/problems/10203/discussion/p/java-stream-solution-o-n/15972
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result=new ArrayList();
        Map<Integer,Integer> hm=new HashMap();
        for(Integer num:A){
            hm.merge(num,1,Integer::sum);
        }
        for(Integer num:B){
            if(hm.containsKey(num) && hm.get(num)!=0){
                result.add(num);
                hm.merge(num,-1,Integer::sum);
            }
        }
        return result;
    }
}

//////
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result=new ArrayList();
       // Map<Integer,Integer> hm=A.stream().mapToInt(num -> num).boxed().collect(Collectors.toMap(num -> num,num -> 1,Integer::sum));
        Map<Integer, Integer> hm = A.stream().mapToInt(num -> num).boxed().collect(Collectors.toMap(num -> num, num -> 1, Integer::sum));

        B.stream().mapToInt(num->num).filter().forEach(
            num->{
                result.add(num);
                hm.merge(num,-1,Integer::sum);
            }
        );
        // for(Integer num:A){
        //     hm.merge(num,1,Integer::sum);
        // }
        // for(Integer num:B){
        //     if(hm.containsKey(num) && hm.get(num)!=0){
        //         result.add(num);
        //         hm.merge(num,-1,Integer::sum);
        //     }
        // }
        return result;
    }
}



