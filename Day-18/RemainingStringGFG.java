public class RemainingStringGFG {
    public static String printString(String s, char ch, int count) {
        String sbstr="";
        int ct=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                if(ct==count){
                    return s.substring(i+1,s.length());
                }else{
                    ct++;
                }
            }
        }
        return sbstr;
    }
    public static void main(String[] args) {
        String s = "Thisisdemostring";
        char ch = 'i';
        int count = 3;
        System.out.println(printString(s, ch, count));
    }
}
