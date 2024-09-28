public class DivideTwoIntegerLC{
    public static int divide(int dividend, int divisor) {
        if(dividend/divisor>(int)Math.pow(2,31)){
            return (int)Math.pow(2,31)-1;
        }
        if(divisor==1){
            return dividend;
        }
        if(dividend/divisor<=-(int)Math.pow(2,31)){
            if(dividend<0&&divisor<0){
                return (int)Math.pow(2,31);
            }
            return -(int)Math.pow(2,31);
        }

        return dividend/divisor;
    }
    public static void  main(String arg[]){
        int dividend = 10, divisor = 3;
        System.out.println(divide(dividend,divisor)));
    }
}