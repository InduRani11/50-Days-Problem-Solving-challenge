public class FirstRepeatingElementGFG {
    public static int firstRepeated(int[] arr) {
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //     max=Math.max(max,arr[i]);
        // }
        // int count[]=new int[max+1];
        // for(int i=0;i<arr.length;i++){
        //     count[arr[i]]++;
        // }
        // int val=-1;
        // for(int i=0;i<count.length;i++){
        //     if(count[arr[i]]>1){
        //         val=arr[i];
        //         break;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==val){
        //         return i+1;
        //     }
        // }
        // return -1;
        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
        int firstRepeatingIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (elementIndexMap.containsKey(arr[i])) {
                firstRepeatingIndex = Math.min(firstRepeatingIndex, elementIndexMap.get(arr[i]));
            } else {
                elementIndexMap.put(arr[i], i);
            }
        }

        return (firstRepeatingIndex == Integer.MAX_VALUE) ? -1 : firstRepeatingIndex + 1;


    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr));
    }
}
