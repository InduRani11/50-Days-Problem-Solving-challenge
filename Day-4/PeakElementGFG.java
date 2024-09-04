

public class PeakElementGFG {
    public static int peakElement(int[] arr,int n)
    {
       int l=1,r=n-2;

       if(n==1){
           return 0;
       }else{
           if(arr[0]>=arr[1]){
               return 0;
           }
           if(arr[n-1]>=arr[n-2]){
               return n-1;
           }
       }
       while(l<=r){
           if(arr[l]>=arr[l-1]&&arr[l]>=arr[l+1]){
               return l;
           }else{
               l++;
           }
           if(arr[r]>=arr[r-1]&&arr[r]>=arr[r+1]){
               return r;
           }else{
               r--;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int  n = 3;
        int arr[] = {1, 2, 3};
        System.out.println(peakElement(arr, n));
    }
}
