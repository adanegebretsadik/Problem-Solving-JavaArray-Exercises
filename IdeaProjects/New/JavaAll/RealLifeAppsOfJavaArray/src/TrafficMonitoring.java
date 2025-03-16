import java.util.Scanner;

public class TrafficMonitoring {
    public static void analyzeTraffic(int[] car){
        int total = 0, maxTraffic = car[0], minTraffic = car[0], maxDay = 0, minDay = 0;

        for (int i = 0; i < car.length; i++) {
            total += car[i];

            if (car[i] > maxTraffic){
                maxTraffic = car[i];
                maxDay = i+1;
            }
            if (car[i] < minTraffic){
                minTraffic = car[i];
                minDay = i+1;
            }
        }
        double average = (double) total/car.length;
        System.out.println("\nTraffic Average: " + average + "cars");
        System.out.println("Day with most traffic: Day" + maxDay + "(" + maxTraffic + "cars)");
        System.out.println("Day with less traffic: Day" + minDay + "(" + minTraffic + "cars)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cars = new int[5];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter number of cars on day: " +(i+1) + ":");
            cars[i] = sc.nextInt();
        }
        analyzeTraffic(cars);
        sc.close();
    }
}
