public class ConvertNoToHexaDecimalLC{
    public static String toHex(int num) {
        if(num == 0) return "0";
        long val = num;
        if(num < 0) val = (long)(Math.pow(2,32) + num);
        StringBuilder res = new StringBuilder();
        while(val != 0){
            int ld = (int) (val % 16);
            val = val/16;
            if(ld >= 10) {
                res.append((char)(ld+87));
            }
            else{
                res.append(ld);
            }
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        int num=26;
        System.out.println(toHex(num));
    }
}