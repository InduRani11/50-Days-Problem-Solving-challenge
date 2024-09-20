
public class ImplementStrStrGFG {
    public static int strstr(String s, String x)
    {
       for(int i=0;i<=s.length()-x.length();i++){
           if(s.charAt(i)==x.charAt(0)){
               String sbstr=s.substring(i,i+x.length());
               if(sbstr.compareTo(x)==0){
                   return i;
               }
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        String s = "GeeksForGeeks", x = "Fr";
        System.out.println(strstr(s, x));

    }

}
