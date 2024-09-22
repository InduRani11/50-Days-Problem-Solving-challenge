public class CountOddNumbersInIntervalLC{
    public static int countOdds(int low, int high) {
        int count=(high-low)/2;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0){
        //         count++;
        //     }
        // }
        if(low%2==0&&high%2==0){
            return count;
        }
        if(low%2!=0||high%2!=0){
            return count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int low = 3, high = 7;
        System.out.println(countOdds(low, high));
    }
}