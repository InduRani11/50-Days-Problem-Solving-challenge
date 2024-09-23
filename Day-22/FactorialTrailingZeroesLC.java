public class FactorialTrailingZeroesLC {
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>=1){
            count=count+n/5;
            n=n/5;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(trailingZeroes(n));
    }
}
