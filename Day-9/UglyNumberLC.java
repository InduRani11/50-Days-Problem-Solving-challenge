
public class UglyNumberLC {
    public static boolean isUgly(int n) {
        if(n<=5&&n>0){
            return true;
        }
        if(n<=0){
            return false;
        }
        while(n>5){
            if(n%2!=0&&n%3!=0&&n%5!=0){
                return false;
            }
            if(n%2==0){
                n=n/2;
            }
            if(n%3==0){
                n=n/3;
            }
            if(n%5==0){
                n=n/5;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(isUgly(n));
    }
}
