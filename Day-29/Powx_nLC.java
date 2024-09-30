

public class Powx_nLC {
    public static double myPow(double x, int n) {
        double poe=1;
        if(x==1||(x==-1&&n%2==0)){
            return 1;
        }
        if(x==-1&&n%2!=0){
            return -1;
        }
        int tm=Math.abs(n);
        for(int i=0;i<tm;i++){
            poe=poe*x;
        }
        if(n<-2147483647){
            return 0;
        }
        if(n<0){
            return (double)1/poe;
        }else{
            return poe;
        }
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }
}
