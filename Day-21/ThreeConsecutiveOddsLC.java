public class ThreeConsecutiveOddsLC {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            int count=0;
            System.out.println("gvd");
            if(arr[i]%2!=0){
                System.out.println("xfvd");
                for(int j=i;j<i+3;j++){
                    if(arr[j]%2!=0){
                        count++;
                    }
                }
                System.out.println(count);
                if(count==3){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
