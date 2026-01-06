package dsa.arrays;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/reverse-string/description/">...</a>
 */
public class ReverseString {
    public static void main(String[] args) {

        char[] s = {'a','b','c','d','e'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        if(s.length ==0 || s.length ==1){
            System.out.println(Arrays.toString(s));
            return;
        }
        int start = 0;
        int end = s.length-1;

        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++ ;
            end --;
        }
        System.out.println(Arrays.toString(s));
    }
}
