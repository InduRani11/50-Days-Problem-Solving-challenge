import java.util.*;
public class LongestSubStringWithoutRepeatedCharLC {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (s.length() == 0){
            return 0;
        }
        ArrayList<ArrayList<Character>> answer = new ArrayList<ArrayList<Character>>();
        for (int i = 0; i < n; i++){
            ArrayList<Character> result = new ArrayList<>();
            result.add(s.charAt(i));
            for (int j = i + 1; j < n; j++){
                if (result.contains(s.charAt(j))){
                    break;
                }
                else {
                    result.add(s.charAt(j));
                }
            }
            answer.add(result);
        }
        int max=0;
        for (ArrayList<Character> row : answer){
            max=Math.max(max,row.size());

        }

        return max;

    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
