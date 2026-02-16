package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDisticnt {
    public static void main(String[] args) {
        System.out.println(findLongestSubString("aabacbebebe", 3));
    }

    static int findLongestSubString(String str , int k){
        int low =0 ;
        int n = str.length();
        int res = -1;
        Map<Character, Integer> freq = new HashMap<>();
        for(int high = 0 ; high < n ; high++){
            char ch = str.charAt(high);
            freq.put(ch, freq.getOrDefault(ch,0)+1);

            while (freq.size() > k){
                char leftChar = str.charAt(low);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0) freq.remove(leftChar);
                low ++;
            }

            if(freq.size() == k){
                int len = high -low + 1 ;
                res = Math.max(res, len);
            }
        }
        return res;
    }
}
