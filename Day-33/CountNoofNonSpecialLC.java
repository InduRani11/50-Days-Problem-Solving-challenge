public class CountNoofNonSpecialLC {
    public static boolean isprime(int x){
        if(x==1) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(x)+1; i += 2) {
            if (x % i == 0) return false;
        }

        return true;
    }
    public static int nonSpecialCount(int l, int r) {
        int x=(int)Math.sqrt(l);
        int y=(int)Math.sqrt(r);
        int count=r-l+1;
        if(Math.sqrt(l)==x&&isprime(x)){
                count--;

        }
        // if(Math.sqrt(r)==y&&isprime(y)){
        //     count--;

        // }
        for(int i=x+1;i<=y;i++){

            if(isprime(i)){
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int l = 5, r = 7;
        System.out.println(nonSpecialCount(l, r));
    }
}
