package dsa.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println("Is palindrome ? "+isPalindromeIterativeWay(str) );
        System.out.println("Is palindrome ? "+isPalindromeRecursiveWay(str,0, str.length()-1) );


    }

    private static boolean isPalindromeRecursiveWay(String str, int i, int j) {
        if(i >j)
            return true;
        return ( str.charAt(i) == str.charAt(j) ) && isPalindromeRecursiveWay(str, i+1 , j-1);
    }


    private static boolean isPalindromeIterativeWay(String str) {
        int i =0 ;
        int j= str.length()-1;
        while(i <= j){
           if(str.charAt(i) != str.charAt(j)){
               return false;
           }
           i++;
           j--;
        }
        return true ;
    }
}
