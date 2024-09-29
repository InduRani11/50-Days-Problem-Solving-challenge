import java.math.*;

public class MultiplyStringLC {
    public static String multiply(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return (a.multiply(b)).toString();
    }
    public static void main(String[] args) {
        String num1 = "6548982", num2 = "47555423";
        System.out.println(multiply(num1, num2));
    }
}
