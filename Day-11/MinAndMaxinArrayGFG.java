import java.util.*;

public class MinAndMaxinArrayGFG {
    class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public static void getMinMax(int[] arr) {
        long max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println(max+" "+min);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        getMinMax(arr);
    }
}
