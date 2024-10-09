public class ComplementBase10IntLC{
    public static int bitwiseComplement(int n) {
        int nw=0;
        double i=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            if(n%2==0){
                nw=nw+(int)Math.pow(2,i);
            }
            i++;
            n=n/2;
        }
        return nw;

    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(bitwiseComplement(n));
    }
}