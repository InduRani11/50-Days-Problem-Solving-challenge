

public class BubbleSortGFG {
    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5, arr[] = {4, 1, 3, 9, 7};
        bubbleSort(arr, n);
    }
}
