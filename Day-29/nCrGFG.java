
public class nCrGFG {
    public static int nCr(int n, int r)
    {
        int[] C = new int[r+1];
        for(int i = 0;i <= r;i++)
            C[i] = 0;
        // Top row of Pascal Triangle
        C[0] = 1;
        for(int i = 0;i <= n;i++){
            for(int j = Math.min(i, r); j > 0; j--){
                C[j] =(C[j] + C[j-1])%1000000007;
            }
        }
        return C[r]%1000000007;
    }
    public static void main(String arg[]){
        int n = 3, r = 2;
        System.out.println(nCr(n, r));
    }
}
