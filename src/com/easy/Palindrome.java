package com.easy;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println( isPalindrome(121));
    }

    public static boolean isPalindrome(int num)
    {
        String str = String.valueOf(num) ;
        for( int i=0 , j=str.length()-1 ; i < str.length() ; i++,j-- )
        {
            if( str.charAt(i) != str.charAt(j))
            {
                return false ;
            }
        }
        return  true ;
    }
}
