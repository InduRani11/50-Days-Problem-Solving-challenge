public class PrintPattern1GFG {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                for(int k=0;k<n-i+1;k++){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}
