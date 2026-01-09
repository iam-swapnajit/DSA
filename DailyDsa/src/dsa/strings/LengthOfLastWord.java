package dsa.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(calculateLengthOfLastWordOptimized2("    qw"));
    }
    static int calculateLengthOfLastWord(String str){
        int count =0 ;
        int n = str.length()-1;
        while(n>=0){
            if(str.charAt(n) == ' '){
                n --;
            }
            else break;
        }
        while (n>=0 && str.charAt(n) != ' '){
            count++;
            n--;
        }
        return count;

    }

    static int calculateLengthOfLastWordOptimized(String str){
        int count =0 ;
        int n = str.length()-1;
        boolean foundChar = false;
        while(n>=0){
            if(str.charAt(n) == ' ' && !foundChar){
                n --;
            } else if (str.charAt(n) == ' ' && foundChar) {
                break;
            } else {
                foundChar = true;
                count++;
                n --;
            }
        }
        return count;
    }

    static int calculateLengthOfLastWordOptimized2(String str){
        int count =0 ;
        int n = str.length()-1;

        while(n>=0){
            if (str.charAt(n) != ' ') count ++;
            else if (count >0) {
                break;
            }
            n--;
        }
        return count;
    }
}
