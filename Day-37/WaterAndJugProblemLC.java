public class WaterAndJugProblemLC{
    public static int GCD(int a, int b){
        while(b != 0 ){
            int temp = b;
            b = a%b;
            a = temp;
        }
    return a;
    }
    public static boolean canMeasureWater(int x, int y, int target) {
        if(target>(x+y)){
            return false;
        }
        if(x == target || y == target || x + y == target ){
            return true;
        }
        return target%GCD(x, y) == 0;
    }
    public static void main(String[] args) {
        int x = 3, y = 5, target = 4;
        System.out.println(canMeasureWater(x,y,target));
    }
}