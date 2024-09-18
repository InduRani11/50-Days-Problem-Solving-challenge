public class ReplaceElementWithGreatestOnrightSideLC{
    public static void replaceElements(int[] arr) {
        int greater=-1;
        int a[]=new int[arr.length];


        for(int i=arr.length-1;i>=0;i--){
            a[i]=greater;
            greater=Math.max(greater,arr[i]);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};
        replaceElements(arr);
    }
}