

public class PowerOfTwoLC {

    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}
