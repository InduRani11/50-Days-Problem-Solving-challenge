import java.util.*;
public class CheckEqualArraysGFG {
    public static boolean check(int[] arr1, int[] arr2) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            ar.add(arr1[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(!ar.contains(arr2[i])){
                return false;
            }
            else{
                ar.remove(ar.indexOf(arr2[i]));
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1};
        System.out.println(check(arr1, arr2));
    }
}
