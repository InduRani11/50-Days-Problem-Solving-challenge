public class RemoveSpacesGFG {
    public static String modify(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S = "geeks  for geeks";
        System.out.println(modify(S));
    }
}
