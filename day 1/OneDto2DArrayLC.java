/*
 * Daily streak problem date 1st september
 */

public class OneDto2DArrayLC {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int[m][n];
        int arr1[][]={};
        int k=0;
        if(m*n==original.length){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=original[k];
                    k++;
                }
            }
        }
        else{
            return arr1;
        }
        return arr;
    }
    public static void main(String arg[]){
        int original[] = {1 , 2 , 3 , 4};
        int m = 2;
        int n = 2;
        construct2DArray(original,m,n);
    }
}
