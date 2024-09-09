import java.util.*;
public class CheckArraySortedGFG {
    public static boolean arraySortedOrNot(List<Integer> arr) {
        if(arr.size()>=2 && arr.get(0)<=arr.get(arr.size()-1)){
            for(int i=0;i<arr.size()-1;i++){
                if(arr.get(i)>arr.get(i+1)){
                    return false;
                }
            }
        }else if(arr.size()>=2 && arr.get(0)>=arr.get(arr.size()-1)){
            for(int i=0;i<arr.size()-1;i++){
                if(arr.get(i)<arr.get(i+1)){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arraySortedOrNot(arr));
    }
}
