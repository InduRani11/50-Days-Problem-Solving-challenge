

public class CheckTwoStringArrauAreEquivlentLC {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        if(sb1.toString().compareTo(sb2.toString())==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String word1[] = {"ab", "c"}, word2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
