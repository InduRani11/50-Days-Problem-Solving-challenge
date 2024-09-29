

public class kthElementOfTwoArrayGFG {
    public static long kthElement(int k, int arr1[], int arr2[]) {
        int i=0,j=0,n=arr1.length,m=arr2.length;
        int x=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                x++;
                if(k==x){
                    return arr1[i];
                }
                i++;
            }
            else{
                x++;
                if(k==x){
                    return arr2[j];
                }
                j++;
            }

        }
        while(i<n){

            x++;
            if(k==x){
                return arr1[i];
            }
            i++;
        }
        while(j<m){

            x++;
            if(k==x){
                return arr2[j];
            }
            j++;
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = 5, arr1[] = {2, 3, 6, 7, 9}, arr2[] = {1, 4, 8, 10};
        System.out.println(kthElement(k, arr1, arr2));
    }
}
