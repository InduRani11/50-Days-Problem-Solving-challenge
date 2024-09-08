

public class SumOfSquareNumbrLC {
    public static boolean judgeSquareSum(int c) {
        // int n=(int)Math.sqrt(c);
        // int i=0,j=n;
        // while(i<=j){
        //     int sm=i*i+j*j;
        //     if(sm==c){
        //         return true;
        //     }else
        //     if(sm<c){
        //         i++;
        //     }else if(sm>c){
        //         j--;
        //     }
        // }
        // return false;
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int c=8;
        System.out.println(judgeSquareSum(c));
    }
}
