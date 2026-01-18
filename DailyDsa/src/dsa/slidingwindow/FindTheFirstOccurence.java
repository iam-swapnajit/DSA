package dsa.slidingwindow;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1888866821/">...</a>
 */
public class FindTheFirstOccurence {
    public static void main(String[] args) {
        String haystack = "ssand", needle = "ad";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length();

        while(i+j < haystack.length()+1){
            if(haystack.substring(i, i+j).equals(needle)){
                return i ;
            }
            i++;
        }
        return -1 ;
    }
}
