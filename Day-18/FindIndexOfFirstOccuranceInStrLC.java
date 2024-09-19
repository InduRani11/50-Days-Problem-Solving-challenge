public class FindIndexOfFirstOccuranceInStrLC {
    public static int strStr(String haystack, String needle) {
        int lenStr=haystack.length();
        int lenNed=needle.length();
        if(needle.compareTo(haystack)==0){
            return 0;
        }
        for(int i=0;i<lenStr-lenNed+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String sbstr=haystack.substring(i,i+lenNed);
                if(needle.compareTo(sbstr)==0){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
