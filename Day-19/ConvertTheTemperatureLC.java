

public class ConvertTheTemperatureLC {
    public static void convertTemperature(double celsius) {
        double arr[]=new double[2];
        arr[0]=celsius+273.15;
        arr[1]=(celsius*9/5)+32;
        System.out.println(arr[0]+" "+arr[1]);

    }

    public static void main(String[] args) {
        double celsius = 36.50;
        convertTemperature(celsius);
    }
}
