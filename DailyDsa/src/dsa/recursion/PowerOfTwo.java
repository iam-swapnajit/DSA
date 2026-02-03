package dsa.recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(9));
    }
    public static boolean powerOfTwo(int n){
        if(n==1) return true;
        if(n<1 || n%2 !=0) return false;
        return powerOfTwo(n/2);
    }
}
