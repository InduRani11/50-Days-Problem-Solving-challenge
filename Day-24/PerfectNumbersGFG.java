public class PerfectNumbersGFG {
    public static int isPerfectNumber(long N) {
        long sm=0;
        for(int i=1;i<=(int)Math.sqrt(N);i++){
            if(N%i==0){
                if(N/i==i){
                    sm=sm+i;
                }
                else{
                    sm=sm+N/i+i;
                }

            }

        }
        if(sm-N==N){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int N = 6;
        System.out.println(isPerfectNumber(N));
    }
}
