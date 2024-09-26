
public class MatrixDignolSumLC {
    public static int diagonalSum(int[][] mat) {
        int sm=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j||i+j==mat.length-1){
                    sm=sm+mat[i][j];
                }
            }
        }
        return sm;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }
}
