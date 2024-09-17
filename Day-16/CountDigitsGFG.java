public class CountDigitsGFG {
    public static int evenlyDivides(int N){
        int x=N;
        int count=0;
        while(x>=1){
            if(x%10==0){
                x=x/10;
                continue;
            }
            if(N%(x%10)==0){
                count++;
            }
            x=x/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(evenlyDivides(n));
    }
}
