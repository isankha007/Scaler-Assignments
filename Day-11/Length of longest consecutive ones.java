/**
 * Length of longest consecutive ones
 * 
 * 
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


        Input Format

        The only argument given is string A.
        Output Format

        Return the length of the longest consecutive 1’s that can be achieved.
        Constraints

        1 <= length of string <= 1000000
        A contains only characters 0 and 1.
        For Example

        Input 1:
            A = "111000"
        Output 1:
            3

        Input 2:
            A = "111011101"
        Output 2:
    7
 */
public class Solution {
    public int solve(String A) {
        int n=A.length();
        int[] lArr=new int[n];
        int[] rArr=new int[n];
        lArr[0]=A.charAt(0)-'0';
        rArr[n-1]=A.charAt(n-1)-'0';
        int ans=0;
        for(int i=1;i<n;i++){
            if(A.charAt(i)=='0'){
              lArr[i]=0;
            }else{
                lArr[i]=lArr[i-1]+1;
            }
            
        }
        for(int i=n-2;i>=0;i--){
            if(A.charAt(i)=='0'){
              rArr[i]=0;
            }else{
                rArr[i]=rArr[i+1]+1;
            }
            
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1')count++;
        }
        for(int i=1;i<n-1;i++){
            if(A.charAt(i)=='1'){
                ans=Math.max(ans,lArr[i-1]+rArr[i+1]+1);
            }else{
                if((lArr[i-1]+rArr[i+1])<count){
                    ans=Math.max(ans,(lArr[i-1]+rArr[i+1])+1);
                }else{
                    ans=Math.max(ans,lArr[i-1]+rArr[i+1]);
                }
            }
        }
        //edge cases
        if(A.charAt(0)=='1')
           ans=Math.max(ans,lArr[0]);
        if(A.charAt(n-1)=='1')
           ans=Math.max(ans,rArr[n-1]);           
        
        return ans;
    }
}
