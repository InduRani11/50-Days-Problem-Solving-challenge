public class PalindromeStringGFG {
    public static int isPalindrome(String S) {
        int i=0,j=S.length()-1;
        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
    public static void main(String[] args) {
        String S = "abba";
        System.out.println(isPalindrome(S));
    }
}
