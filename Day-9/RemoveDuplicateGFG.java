import java.util.*;
public class RemoveDuplicateGFG {
    public static int remove_duplicate(List<Integer> arr) {
        int i = 0, n = arr.size();

       for (int j = 1; j < n; j++) {

           if (!arr.get(j).equals(arr.get(i))) {
               i++;
               arr.set(i, arr.get(j));
           }
       }

       return i + 1;

   }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        System.out.println("size of new array:- "+remove_duplicate(arr));
    }
}
