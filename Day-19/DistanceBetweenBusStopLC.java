
public class DistanceBetweenBusStopLC {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sm=0;
        for(int i=0;i<distance.length;i++){
            sm=sm+distance[i];
        }
        int dist=0;
        if(start==0&&destination==distance.length-1){
            return distance[distance.length-1];
        }
        if(start<destination){
            for(int i=start;i<destination;i++){
                dist=dist+distance[i];
            }
        }
        else{
            for(int i=start-1;i>destination-1;i--){
                dist=dist+distance[i];
            }

        }

        return Math.min(dist,sm-dist);
    }
    public static void main(String[] args) {
        int distance[] = {1,2,3,4}, start = 0, destination = 1;
        System.out.println(distanceBetweenBusStops(distance, start, destination));
    }

}
