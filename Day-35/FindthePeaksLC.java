import java.util.*;
public class FindthePeaksLC{
    public static void findPeaks(int[] mountain) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1]){
                l.add(i);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
    }
    public static void main(String[] args) {
        int mountain[] = {1,4,3,8,5};
        findPeaks(mountain);
    }
}