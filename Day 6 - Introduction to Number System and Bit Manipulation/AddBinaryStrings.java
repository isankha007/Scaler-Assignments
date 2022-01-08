// package Day 6 - Introduction to Number System and Bit Manipulation;

// public class AddBinaryStrings {
    
// }
//Add Binary Strings
/*
Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
*/
  
public class Solution {
    public String addBinary(String A, String B) {
        int sum=0;
        int i,j;
        i=A.length()-1;
        j=B.length()-1;
        //int carry=0;
        String res="";
        while(i>=0||j>=0||sum==1){
            //int a,b;
            //a=b=-1
            if(i>=0){
               sum+=Character.getNumericValue(A.charAt(i));
            }else{
                sum+=0;
            }
            if(j>=0){
               sum+=Character.getNumericValue(B.charAt(j));
            }else{
                sum+=0;
            }  
            res=String.valueOf(sum%2)+res;
            sum/=2;
             i--;
             j--;
              
        }
        return res;
        // for(int i=A.length()-1;i>0;i--){
        //     int a,b;
        //     a=b=-1;
        //     if(i<A.length()){
        //       a=Character.getNumericValue(A.charAt(i));
        //     }
        //     if(i<B.length()){
        //       b=Character.getNumericValue(B.charAt(i))
        //     }
        //     if(a==1&&b==1){
        //         carry=1;
        //         res="0"+res;
        //     }else{
        //         carry=1;
        //     }
        // }
        
    }
}



public class Solution {
    public String addBinary(String A, String B) {
        int sum=0;
        int i,j;
        i=A.length()-1;
        j=B.length()-1;
        //int carry=0;
        String res="";
        // while(i>=0||j>=0||sum==1){
        //     //int a,b;
        //     //a=b=-1
        //     if(i>=0){
        //       sum+=Character.getNumericValue(A.charAt(i));
        //     }else{
        //         sum+=0;
        //     }
        //     if(j>=0){
        //       sum+=Character.getNumericValue(B.charAt(j));
        //     }else{
        //         sum+=0;
        //     }  
        //     res=String.valueOf(sum%2)+res;
        //     sum/=2;
        //      i--;
        //      j--;
              
        // }
        // return res;
        for(;i>=0||j>=0||sum==1;i--,j--){
            int a,b;
            a=b=-1;
            if(i>=0){
              sum+=Character.getNumericValue(A.charAt(i));
            }else{
                sum+=0;
            }
            if(j>=0){
              sum+=Character.getNumericValue(B.charAt(j));
            }else{
                sum+=0;
            }
            
            res=String.valueOf(sum%2)+res;
            sum=sum/2;
            
        }
        return res;
        
    }
}

