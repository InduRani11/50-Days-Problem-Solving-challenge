import java.util.*;

public class UnionOfTwoSortedArrayGFG {
    public static void findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        if(arr1[0]<=arr2[0]){
            arr.add(arr1[0]);
            i++;
        }
        else{
            arr.add(arr2[0]);
            j++;
        }

        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                if(arr1[i]!=arr.get(arr.size()-1)){
                    arr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(arr2[j]!=arr.get(arr.size()-1)){
                    arr.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(arr1[i]!=arr.get(arr.size()-1)){
                arr.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(arr2[j]!=arr.get(arr.size()-1)){
                arr.add(arr2[j]);
            }
            j++;
        }
        for(int k=0;k<arr.size();k++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int n = 5, arr1[] = {1, 2, 3, 4, 5};
        int m = 5, arr2 [] = {1, 2, 3, 6, 7};
        findUnion(arr1, arr2, n, m);
    }
}
