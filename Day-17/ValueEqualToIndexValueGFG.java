import java.util.*;
public class ValueEqualToIndexValueGFG {
    public static void valueEqualToIndex(ArrayList<Integer> nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                arr.add(i+1);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(15);
        arr.add(2);
        arr.add(45);
        arr.add(4);
        arr.add(7);
        valueEqualToIndex(arr);
    }
}
