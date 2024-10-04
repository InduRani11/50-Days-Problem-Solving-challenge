public class ChectEveryRowContainEveryNumLC{
    public static boolean checkValid(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+matrix[i][j];
                if(j<n-1){
                    if(matrix[i][j]==matrix[i][j+1]){
                        return false;
                    }
                }

            }

            if(sum!=(n*(n+1)/2)){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+matrix[j][i];
                if(j<n-1&&j>0){
                    if(matrix[j][i]==matrix[j+1][i]||matrix[j-1][i]==matrix[j+1][i]){
                        return false;
                    }
                }
            }
            if(sum!=(n*(n+1)/2)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
    }
}