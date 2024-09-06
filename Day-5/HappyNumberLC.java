

public class HappyNumberLC {

    public static boolean isHappy(int n) {
        int x=n;
        int ans=0;
        int i=0;
        while(i<10){
            ans=0;
            i++;
            while(n>=1){
                ans=ans+(n%10)*(n%10);
                n=n/10;
            }
            if(ans==1){
                return true;
            }
            // else if(ans>=0 && ans<10){
            //     return false;
            // }
            else{
                n=ans;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}
