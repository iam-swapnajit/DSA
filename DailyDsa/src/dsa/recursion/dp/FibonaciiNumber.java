package dsa.recursion.dp;

import java.util.HashMap;
import java.util.Map;

public class FibonaciiNumber {
    public static void main(String[] args) {
        System.out.println(fibDP(20));
    }
    public static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);

    }

    public static Map<Integer, Integer> cache = new HashMap<>();
    public static int fibDP(int n) {
        if(n<=1) return n;
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int cal = fibDP(n-1)+fibDP(n-2);
        cache.put(n,cal);
        return cal;

    }
}
