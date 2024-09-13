public class AddDigitsLC{
    public static int addDigits(int num) {
        int x=0;
        if(num<10){
            return num;
        }
        while(num>9){
            x=0;
            while(num>0){
                x=x+num%10;
                num=num/10;
            }
            num=x;
        }
        return x;
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}