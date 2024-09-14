public class ValidPerfectSquareLC {
    public static boolean isPerfectSquare(int num) {
        if(num==0){
            return true;
        }
        int i=1;
        while(i<=num/i){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}
