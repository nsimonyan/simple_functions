public class Palindrome {
    private static boolean isPalindrome(String word){
        if(word.length()==0 || word.length()==1) return true;
        if(word.charAt(0) != word.charAt(word.length()-1)) return false;
        else isPalindrome(word.substring(1, word.length()-1));
        return true;
    }
    private static boolean isPalindromeSimple(String word){
        char[] chars1 = word.toCharArray();
        for(int i=0;i<chars1.length/2;i++){
            if(chars1[i]!=chars1[chars1.length-(i+1)]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String word="java";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindromeSimple(word));

    }
}
