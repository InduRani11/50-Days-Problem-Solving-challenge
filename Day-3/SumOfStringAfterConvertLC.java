/*
 * ***1945. Sum of Digits of String After Convert

You are given a string s consisting of lowercase English letters, and an integer k.
First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.
For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
 */

public class SumOfStringAfterConvertLC {
    public static int getLucky(String s, int k) {
        int digitSum = 0;

        for (char ch : s.toCharArray()) {
            int numericValue = ch - 'a' + 1;
            while (numericValue > 0) {
                digitSum += numericValue % 10;
                numericValue /= 10;
            }
        }
        if(k>1){
            for(int i=0;i<k-1;i++){
                int Value = digitSum;
                digitSum=0;
                while (Value > 0) {
                    digitSum += Value % 10;
                    Value /= 10;
                }
            }
        }
        return digitSum;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));
    }
}
