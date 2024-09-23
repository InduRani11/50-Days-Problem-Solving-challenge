public class SqrtLC{
    public static int mySqrt(int x) {
        double n=x;
        return (int)Math.sqrt(n);
    }
    public static void main(String[] args) {
        int n=59;
        System.out.println(mySqrt(n));
    }
}