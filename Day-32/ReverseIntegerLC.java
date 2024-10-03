public class ReverseIntegerLC {
    public static int reverse(int x) {
        int n=Math.abs(x);
        if(x>=(int)Math.pow(2,31)-1||x<-(int)Math.pow(2,31)){
            return 0;
        }
        long nw=0;
        while(n>=1){
            nw=nw*10+n%10;
            n=n/10;
        }
        if(nw>=(int)Math.pow(2,31)-1){
            return 0;
        }
        if(x<0){
            return (int)(-1*nw);
        }
        return (int)nw;
    }
    public static void main(String[] args) {
        int x=7654;
        System.out.println(reverse(x));
    }
}
