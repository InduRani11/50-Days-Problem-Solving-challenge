

public class Print1toNWithoutLoopGFG {
    public static void printNos(int N)
    {
        if(N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
    public static void main(String arg[]){
        int n=20;
        printNos(n);
    }
}
