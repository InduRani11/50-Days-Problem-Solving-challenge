public class ReverseStringGFG {
    public static String reverseWord(String str){
        int i=str.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0){
            sb.append(str.charAt(i));
            i--;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s = "Geeks";
        System.out.println(reverseWord(s));
    }
}
