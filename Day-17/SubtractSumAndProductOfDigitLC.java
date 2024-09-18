public class SubtractSumAndProductOfDigitLC {
    public static void main(String[] args) {
        int n=245;
        int pr=1,sm=0;
        while(n>=1){
            int ld=n%10;
            pr=pr*(n%10);
            sm=sm+n%10;
            n=n/10;
            System.out.println(ld+" "+pr+" "+sm);
        }
        int res=pr-sm;
        System.out.println(res);
    }
}
