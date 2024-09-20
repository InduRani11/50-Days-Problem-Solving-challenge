

public class RowWithMax1sGFG {
    public static int rowWithMax1s(int arr[][]) {
        int rct=0;
        int maxct=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(Math.max(maxct,count)>maxct){
                rct=i;
                maxct=Math.max(maxct,count);
            };
            if(count==arr[0].length){
                return i;
            }
        }
        if(maxct==0){
            return -1;
        }
        return rct;
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0}};
        System.out.println(rowWithMax1s(arr));
    }
}
