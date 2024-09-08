

public class RotatedArrayGFG {

    public static void rotate(int arr[],int idx,int d,int n){
        if(idx==n){
            return;
        }
        int num=arr[(idx+d)%n];
        rotate(arr,idx+1,d,n);
        arr[idx]=num;
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArr(int arr[], int d, int n) {

        rotate(arr,0,d,n);
        // for(int j=0;j<n-1;j++){
        //     arr[j]=arr[(j+d)%n]
        // }
    }
    public static void main(String[] args) {
        int  n = 5, d = 2, arr[] = {1,2,3,4,5};
        rotateArr(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
