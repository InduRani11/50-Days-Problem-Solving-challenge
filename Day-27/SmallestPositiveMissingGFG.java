import java.util.*;
public class SmallestPositiveMissingGFG {
    public static int missingNumber(ArrayList<Integer> prices) {
        int i=1;
        for(i=1;i<=prices.size()+1;i++){
            if(prices.contains(i)){
                continue;
            }else{
                return i;
            }
        }
        return 0;
    }
    public static void main(String arg[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(missingNumber(arr));
    }
}
