

public class ArmstrongNumbersGFG {
    public static String armstrongNumber(int n) {
        int sm=0;
        int x=n;
        while(x>=1){
            sm=sm+(int)Math.pow(x%10,3);
            x=x/10;

        }
        if(sm==n){
            return "true";
        }else{
            return "false";
        }
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }
}
