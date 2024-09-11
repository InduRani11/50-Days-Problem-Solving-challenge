
public class LengthOfLastWordLC {
    public static int lengthOfLastWord(String s) {
        int n=s.length();
        int sp=0;
        if(n==1){
            return 1;
        }
        for(int i=n-1;i>0;i--){

            if(s.charAt(i-1)==' '&&s.charAt(i)!=' '){
                return n-sp-i;
            }
            if(s.charAt(i)==' '){
                sp++;
            }
        }
        return n-sp;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
