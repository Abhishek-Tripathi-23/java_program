package practiceQ;

import java.util.Stack;

class longestPalindrome{
    int maxPalindromeLength = Integer.MIN_VALUE;
    String maxPalindrome = "";
    public String longestPalindrome(String s) {
        int i=0;
        while(i<s.length()){
            checkPalindrome(s,i,i);
            checkPalindrome(s,i,i+1);
            i++;
        }
        System.out.println(maxPalindrome);
        return maxPalindrome;
        
    }
    
    public void checkPalindrome(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        if(j-i-1 > maxPalindromeLength){
            maxPalindrome = s.substring(i+1,j);
            maxPalindromeLength = j-i-1;
        }
        
        
    }
}