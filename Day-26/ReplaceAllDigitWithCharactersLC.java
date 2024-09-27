public class ReplaceAllDigitWithCharactersLC {
    public static String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sb.append( Character.toString (ch + s.charAt(i)-'0'));
            }else{
                ch=s.charAt(i);
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }
}
