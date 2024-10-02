import java.util.*;

public class SpiralMatrixLC {
    public static void spiralOrder(int[][] matrix) {

        ArrayList<Integer> l=new ArrayList<>();
        int sr=0,sc=0;
        int er=matrix.length-1;
        int ec=matrix[sr].length-1;
        if(er==0){
           for(int i=sc;i<=ec;i++){
                l.add(matrix[sr][i]);
            }
            for(int i=0;i<l.size();i++){
                System.out.print(l.get(i)+" ");
            }

        }
        if(ec==0){
           for(int i=sr;i<=er;i++){
                l.add(matrix[i][ec]);
            }
            for(int i=0;i<l.size();i++){
                System.out.print(l.get(i)+" ");
            }
        }
        while(sr<=er&&sc<=ec){
            for(int i=sc;i<=ec;i++){
                l.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){

                l.add(matrix[i][ec]);
            }
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                l.add(matrix[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                l.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;

        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
