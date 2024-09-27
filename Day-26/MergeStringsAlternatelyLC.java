public class MergeStringsAlternatelyLC {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l1=word1.length();
        int l2=word2.length();
        int i=0,j=0;
        while(i<l1&&j<l2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<l1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<l2){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
    public static void main(String arg[]){
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
