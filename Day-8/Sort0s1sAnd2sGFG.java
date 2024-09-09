import java.util.*;
public class Sort0s1sAnd2sGFG {
    public static void sort012(ArrayList<Integer> arr) {
        int n = arr.size();
        int low = 0, high = n - 1, mid = 0;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, mid++, low++);
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, mid, high--);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(0);
        sort012(arr);
    }
}
