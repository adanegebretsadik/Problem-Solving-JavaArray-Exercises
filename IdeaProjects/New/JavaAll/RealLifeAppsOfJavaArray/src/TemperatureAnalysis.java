import java.util.Scanner;
public class TemperatureAnalysis {
    public static void temperatureAnalysis( Scanner x){
        double[] temperature = new double[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Enter temperature for day:" + (i + 1) + ":");
            temperature[i] = x.nextDouble();
        }
        double sum = 0, highest = temperature[0], lowest = temperature[0];
        for (double temp: temperature){
            sum += temp;
            highest = Math.max(temp, highest);
            lowest = Math.min(temp, lowest);
        }
        double avg = sum / temperature.length;
        System.out.println("Average temperatures: " + avg);
        System.out.println("Hottest day temperatures: " + highest);
        System.out.println("The Coldest day temperatures: " + lowest);

        x.close();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        temperatureAnalysis(scanner);

    }
}
