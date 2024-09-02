public class SecondLargestGFG {
    public static int print2largest(int[] arr) {
        int max=0;
        int secondMax=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                continue;
            }
            else{
                secondMax=Math.max(secondMax,arr[i]);
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest:-"+print2largest(arr));
    }
}
