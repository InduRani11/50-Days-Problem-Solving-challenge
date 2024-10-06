public class HarshadNumberLC {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int sm=0;
        while(n>=1){
            sm=sm+n%10;
            n=n/10;
        }
        if(x%sm==0){
            return sm;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int x = 18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}
